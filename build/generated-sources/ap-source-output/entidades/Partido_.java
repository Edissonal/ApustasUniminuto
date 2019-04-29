package entidades;

import entidades.Apuesta;
import entidades.Equipo;
import entidades.Equipo2;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-29T00:22:43")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-29T00:14:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T22:37:55")
>>>>>>> 374c4f0b4dc607b6048042b6f86e9f864aa9b7d4
>>>>>>> 4c18ac32bb89aa68b2b3828cbf437ec72866d72e
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Equipo> idEquipo;
    public static volatile SingularAttribute<Partido, Equipo2> idEquipo2;
    public static volatile SingularAttribute<Partido, Integer> idPartido;
    public static volatile SingularAttribute<Partido, Integer> marcadorEquip1;
    public static volatile SingularAttribute<Partido, Integer> marcadorEquip2;
    public static volatile CollectionAttribute<Partido, Apuesta> apuestaCollection;

}