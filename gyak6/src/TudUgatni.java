public interface TudUgatni {
    /* ez egy interface
    interfaceben két dolog lehet:
    - statikus konstantsok: public static final
    - metodusok: public abstract

    mit jelent a static szó?
    azt jelenti hogy osztalyszintű

    ebből a szempontbol egy tag (mező/metodus) lehet:
     - példányszintű (nincs kulcsszava),
     - osztályszintű (kulcsszava: static)

     hívás:
     példányszintűt ugy hivok meg, hogy:
      - példányneve.tagneve
     osztályszintűt ugy hivok meg, hogy
      - osztályneve.tagneve


    osztályban két dolog lehet:
     - mezők
     - metodusok
     */
    String ugatásHangja = "vauvau";
    /*interfaceen belül minden tag public, ezért
    nem irjuk ki
    interfaceen belül minden mező:
    public static final

    finalnek 3 hasznalata van
    final class: nem lehet belőle örökölni
    final method: nem lehet override-olni
    final mező: ez a mező konstans

    String ugatásHangja; sor hiba: Variable 'ugatásHangja' might not have been initialized
    konstansnak mindig kell kezdoértéket adni

    interfaceben csak a metodusok fejét kell megfogalmazni, a törzsét nem, de azt is lehet
    a metodusok alapvetoen példányszintuek, de lehet static is

     */
    String ugat();
    //mit nem irtam ki: public, abstract

    //default kulcsszoval meg lehet adni a törzset, innentol fogva nem muszaj overrideolni

    /*
    static jelentése: osztalyszintű
    osztályszintű dolgot ugy kell hivni hogy osztalyneve.tagneve
     */
}
