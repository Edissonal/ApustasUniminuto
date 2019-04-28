package entidades;

import entidades.Boleteria;
import entidades.Ganadores;
import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T14:27:50")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T14:38:09")
>>>>>>> Stashed changes
@StaticMetamodel(Rifa.class)
public class Rifa_ { 

    public static volatile SingularAttribute<Rifa, String> premio;
    public static volatile SingularAttribute<Rifa, Integer> idRifa;
    public static volatile SingularAttribute<Rifa, Boleteria> idBoleteria;
    public static volatile SingularAttribute<Rifa, Usuarios> idUsuarios;
    public static volatile CollectionAttribute<Rifa, Ganadores> ganadoresCollection;

}