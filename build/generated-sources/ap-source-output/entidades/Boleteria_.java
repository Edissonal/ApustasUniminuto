package entidades;

import entidades.Apuesta;
import entidades.Rifa;
import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T16:36:42")
@StaticMetamodel(Boleteria.class)
public class Boleteria_ { 

    public static volatile SingularAttribute<Boleteria, Integer> precio;
    public static volatile CollectionAttribute<Boleteria, Rifa> rifaCollection;
    public static volatile SingularAttribute<Boleteria, Integer> idBoleteria;
    public static volatile SingularAttribute<Boleteria, Integer> cantidad;
    public static volatile SingularAttribute<Boleteria, Usuarios> idUsuarios;
    public static volatile CollectionAttribute<Boleteria, Apuesta> apuestaCollection;

}