package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Album;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-22T22:36:12", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Tema.class)
public class Tema_ { 

    public static volatile SingularAttribute<Tema, Integer> posicion;
    public static volatile SingularAttribute<Tema, String> archivo;
    public static volatile SingularAttribute<Tema, Album> album;
    public static volatile SingularAttribute<Tema, String> duracion;
    public static volatile SingularAttribute<Tema, Long> id;
    public static volatile SingularAttribute<Tema, String> direccionWeb;
    public static volatile SingularAttribute<Tema, String> nombre;

}