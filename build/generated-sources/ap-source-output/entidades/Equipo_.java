package entidades;

import entidades.Partido;
import entidades.TipoDeporte;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T14:27:50")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T14:38:09")
>>>>>>> Stashed changes
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile CollectionAttribute<Equipo, Partido> partidoCollection;
    public static volatile SingularAttribute<Equipo, Integer> idEquipo;
    public static volatile SingularAttribute<Equipo, TipoDeporte> idTipoDeporte;
    public static volatile SingularAttribute<Equipo, String> nombEquipo;

}