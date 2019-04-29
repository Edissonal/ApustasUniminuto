package entidades;

import entidades.Equipo;
import entidades.Equipo2;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T21:52:18")
@StaticMetamodel(TipoDeporte.class)
public class TipoDeporte_ { 

    public static volatile CollectionAttribute<TipoDeporte, Equipo2> equipo2Collection;
    public static volatile SingularAttribute<TipoDeporte, String> nombDepor;
    public static volatile CollectionAttribute<TipoDeporte, Equipo> equipoCollection;
    public static volatile SingularAttribute<TipoDeporte, Integer> idTipoDeporte;

}