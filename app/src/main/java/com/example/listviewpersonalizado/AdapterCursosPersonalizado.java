package com.example.listviewpersonalizado;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterCursosPersonalizado extends BaseAdapter {

    private final List<Curso> cursos;
    private final Activity act;

    public AdapterCursosPersonalizado(List<Curso> cursos, Activity act) {
        this.cursos = cursos;
        this.act = act;
    }

    @Override
    public int getCount() {
        return cursos.size();
    }

    @Override
    public Object getItem(int position) {
        return cursos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.activity_lista_cursos, parent, false);
        Curso curso = cursos.get(position);

        //pegando as referências das Views
        TextView nome = (TextView) view.findViewById(R.id.lista_curso_personalizada_nome);
        TextView descricao = (TextView) view.findViewById(R.id.lista_curso_personalizada_descricao);
        ImageView imagem = (ImageView) view.findViewById(R.id.lista_curso_personalizada_imagem);

        //populando as Views
        nome.setText(curso.getNome());
        descricao.setText(curso.getDescricao());

        Categoria categoria = curso.getCategoria();

        if (categoria.equals(Categoria.JAVA)) {
            imagem.setImageResource(R.mipmap.java);
        } else if (categoria.equals(Categoria.ANDROID)) {
            imagem.setImageResource(R.mipmap.ic_launcher);
        } else if (categoria.equals(Categoria.HTML)) {
            imagem.setImageResource(R.mipmap.html);
        }

        return view;
    }
}
