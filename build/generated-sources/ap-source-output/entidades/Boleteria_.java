package entidades;

import entidades.Apuesta;
import entidades.Rifa;
import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T21:48:22")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T21:52:19")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T21:16:36")
>>>>>>> 1e662681ec03bfd21eaae1b39f4caff293241251
>>>>>>> e262f9b2c49ecb2526f9ff5d2bb4d327c57faf74
@StaticMetamodel(Boleteria.class)
public class Boleteria_ { 

    public static volatile SingularAttribute<Boleteria, Integer> precio;
    public static volatile CollectionAttribute<Boleteria, Rifa> rifaCollection;
    public static volatile SingularAttribute<Boleteria, Integer> idBoleteria;
    public static volatile SingularAttribute<Boleteria, Integer> cantidad;
    public static volatile SingularAttribute<Boleteria, Usuarios> idUsuarios;
    public static volatile CollectionAttribute<Boleteria, Apuesta> apuestaCollection;

}