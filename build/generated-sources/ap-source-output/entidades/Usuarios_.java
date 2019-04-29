package entidades;

import entidades.Apuesta;
import entidades.Boleteria;
import entidades.Perfiles;
import entidades.Rifa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-29T00:14:18")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T22:37:55")
>>>>>>> 374c4f0b4dc607b6048042b6f86e9f864aa9b7d4
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, Perfiles> idPerfiles;
    public static volatile CollectionAttribute<Usuarios, Boleteria> boleteriaCollection;
    public static volatile SingularAttribute<Usuarios, String> nombUsu;
    public static volatile CollectionAttribute<Usuarios, Rifa> rifaCollection;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuarios;
    public static volatile SingularAttribute<Usuarios, Integer> cedulUsu;
    public static volatile CollectionAttribute<Usuarios, Apuesta> apuestaCollection;

}