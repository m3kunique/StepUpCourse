public class Name {
    String personalName;
    String familyName;
    String patronomyc;

    public Name(String personalName, String familyName, String patronomyc) {
        if (personalName!=null) this.personalName=personalName;
        if (familyName!=null) this.familyName=familyName;
        if (patronomyc!=null) this.patronomyc=patronomyc;
    }

    public static Name ofPersonalAndFamily(String personalName, String familyName) {
        return new Name(personalName, familyName, "");
    }

    @Override
    public String toString() {
        return String.format("personal: %s\tfamily: %s\tpatromyc: %s", this.personalName, this.familyName, this.patronomyc);
    }

    public static Name ofPersonalAndPatronomyc(String personalName, String patronomyc) {
        return new Name(personalName, "", patronomyc);
    }

}
