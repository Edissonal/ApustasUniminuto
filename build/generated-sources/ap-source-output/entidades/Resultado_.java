package entidades;

import entidades.Apuesta;
import entidades.Partido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-27T15:25:22")
@StaticMetamodel(Resultado.class)
public class Resultado_ { 

    public static volatile SingularAttribute<Resultado, Partido> idPartido;
    public static volatile SingularAttribute<Resultado, Integer> idResultado;
    public static volatile CollectionAttribute<Resultado, Apuesta> apuestaCollection;

}