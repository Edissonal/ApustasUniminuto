package entidades;

import entidades.Partido;
import entidades.TipoDeporte;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-29T00:22:43")
@StaticMetamodel(Equipo2.class)
public class Equipo2_ { 

    public static volatile CollectionAttribute<Equipo2, Partido> partidoCollection;
    public static volatile SingularAttribute<Equipo2, Integer> idEquipo2;
    public static volatile SingularAttribute<Equipo2, String> nombEquipo2;
    public static volatile SingularAttribute<Equipo2, TipoDeporte> idTipoDeporte;

}