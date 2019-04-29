package entidades;

import entidades.Boleteria;
import entidades.Ganadores;
import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-29T00:14:18")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T22:37:55")
>>>>>>> 374c4f0b4dc607b6048042b6f86e9f864aa9b7d4
@StaticMetamodel(Rifa.class)
public class Rifa_ { 

    public static volatile SingularAttribute<Rifa, String> premio;
    public static volatile SingularAttribute<Rifa, Integer> idRifa;
    public static volatile SingularAttribute<Rifa, Boleteria> idBoleteria;
    public static volatile SingularAttribute<Rifa, Usuarios> idUsuarios;
    public static volatile CollectionAttribute<Rifa, Ganadores> ganadoresCollection;

}