package entidades;

import entidades.Apuesta;
import entidades.Equipo;
import entidades.Equipo2;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T21:48:22")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T21:52:18")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T21:16:36")
>>>>>>> 1e662681ec03bfd21eaae1b39f4caff293241251
>>>>>>> e262f9b2c49ecb2526f9ff5d2bb4d327c57faf74
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Equipo> idEquipo;
    public static volatile SingularAttribute<Partido, Equipo2> idEquipo2;
    public static volatile SingularAttribute<Partido, Integer> idPartido;
    public static volatile SingularAttribute<Partido, Integer> marcadorEquip1;
    public static volatile SingularAttribute<Partido, Integer> marcadorEquip2;
    public static volatile CollectionAttribute<Partido, Apuesta> apuestaCollection;

}