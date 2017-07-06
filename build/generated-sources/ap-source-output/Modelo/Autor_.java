package Modelo;

import Modelo.Livro;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-06T19:13:33")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile SingularAttribute<Autor, Date> dataNasc;
    public static volatile SingularAttribute<Autor, String> biografia;
    public static volatile SingularAttribute<Autor, String> imagem;
    public static volatile SingularAttribute<Autor, String> nome;
    public static volatile SingularAttribute<Autor, Integer> id;
    public static volatile CollectionAttribute<Autor, Livro> livroCollection;

}