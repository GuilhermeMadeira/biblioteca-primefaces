package Modelo;

import Modelo.Livro;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-06T19:13:33")
@StaticMetamodel(Editora.class)
public class Editora_ { 

    public static volatile SingularAttribute<Editora, String> site;
    public static volatile SingularAttribute<Editora, String> sede;
    public static volatile SingularAttribute<Editora, String> nome;
    public static volatile SingularAttribute<Editora, Integer> id;
    public static volatile CollectionAttribute<Editora, Livro> livroCollection;

}