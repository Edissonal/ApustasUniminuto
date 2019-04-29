package entidades;

import entidades.Boleteria;
import entidades.Ganadores;
import entidades.Partido;
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
@StaticMetamodel(Apuesta.class)
public class Apuesta_ { 

    public static volatile SingularAttribute<Apuesta, Integer> marcador2;
    public static volatile SingularAttribute<Apuesta, Integer> marcador1;
    public static volatile SingularAttribute<Apuesta, Boleteria> idBoleteria;
    public static volatile SingularAttribute<Apuesta, Partido> idPartido;
    public static volatile SingularAttribute<Apuesta, Integer> idApuesta;
    public static volatile SingularAttribute<Apuesta, Usuarios> idUsuarios;
    public static volatile CollectionAttribute<Apuesta, Ganadores> ganadoresCollection;

}