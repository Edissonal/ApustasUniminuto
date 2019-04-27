package entidades;

import entidades.Apuesta;
import entidades.Equipo;
import entidades.Resultado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-27T15:25:22")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Equipo> idEquipo;
    public static volatile SingularAttribute<Partido, Integer> idPartido;
    public static volatile CollectionAttribute<Partido, Resultado> resultadoCollection;
    public static volatile CollectionAttribute<Partido, Apuesta> apuestaCollection;

}