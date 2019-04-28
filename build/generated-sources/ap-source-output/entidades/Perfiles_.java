package entidades;

import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T16:36:42")
@StaticMetamodel(Perfiles.class)
public class Perfiles_ { 

    public static volatile SingularAttribute<Perfiles, Integer> idPerfiles;
    public static volatile CollectionAttribute<Perfiles, Usuarios> usuariosCollection;
    public static volatile SingularAttribute<Perfiles, String> nombPerf;

}