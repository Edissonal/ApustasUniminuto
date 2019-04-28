package entidades;

import entidades.Apuesta;
import entidades.Equipo;
import entidades.Equipo2;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T14:27:50")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T14:38:09")
>>>>>>> Stashed changes
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Equipo> idEquipo;
    public static volatile SingularAttribute<Partido, Equipo2> idEquipo2;
    public static volatile SingularAttribute<Partido, Integer> idPartido;
    public static volatile SingularAttribute<Partido, Integer> marcadorEquip1;
    public static volatile SingularAttribute<Partido, Integer> marcadorEquip2;
    public static volatile CollectionAttribute<Partido, Apuesta> apuestaCollection;

}