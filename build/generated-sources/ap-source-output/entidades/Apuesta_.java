package entidades;

import entidades.Boleteria;
import entidades.Ganadores;
import entidades.Partido;
import entidades.Resultado;
import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-27T15:25:22")
@StaticMetamodel(Apuesta.class)
public class Apuesta_ { 

    public static volatile SingularAttribute<Apuesta, Boleteria> idBoleteria;
    public static volatile SingularAttribute<Apuesta, Partido> idPartido;
    public static volatile SingularAttribute<Apuesta, Integer> idApuesta;
    public static volatile SingularAttribute<Apuesta, Usuarios> idUsuarios;
    public static volatile SingularAttribute<Apuesta, Resultado> idResultado;
    public static volatile CollectionAttribute<Apuesta, Ganadores> ganadoresCollection;

}