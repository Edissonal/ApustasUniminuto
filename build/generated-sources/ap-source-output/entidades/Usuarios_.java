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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-29T00:22:37")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-29T00:22:43")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-29T00:14:18")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-28T22:37:55")
>>>>>>> 374c4f0b4dc607b6048042b6f86e9f864aa9b7d4
>>>>>>> 4c18ac32bb89aa68b2b3828cbf437ec72866d72e
>>>>>>> 88887f1b96ea888c95832c2e97d7464dab43c413
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