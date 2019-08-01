package com.application.doctorsuggest.doctorsuggest.doctors;

public enum Specialization {
    Emergency("Acil Hekimi"),
    Acupuncture("Akupunktur"),
    Anesthesia("Anestezi"),
    Otorhinolaryngology("Kulak Burun Boğaz"),
    NuritionAndDiet("Beslenme ve Diyetetik"),
    KidneyDiseases("Böbrek Hastalıkları"),
    ChinSurgery("Çene Cerrahisi"),
    InfantileDiseases("Çocuk Hastalıkları"),
    InfantileCardiology("Çocuk Kardiyolojisi"),
    InfantileNeurology ("Çocuk Nörolojisi"),
    InternalDiseases("Dahiliye"),
    Deontology("Dentoloji"),
    Dermatology("Dermatoloji"),
    Dentistry("Diş Hekimliği"),
    Endocrinology("Endokrinoloji"),
    Epidemiology("Epidemoloji"),
    PlasticSurgery("Plastik Cerrahi"),
    Physiotherapy("Fizik Tedavi"),
    Gastroenterology("Gastroenteroloji"),
    ThoracicSurgery("Göğüs Cerrahisi"),
    ChestDiseases("Göğüs Hastalıkları"),
    EyeDiseases("Göz Hastalıkları"),
    Gynecology("Jinekoloji"),
    Cardiology("Kardiyoloji"),
    StomachDiseases("Mide Hastalıkları"),
    Neurology("Nöroloji"),
    Oncology("Onkoloji"),
    Orthopaedy("Ortapedi"),
    Psychiatry("Psikiyatri"),
    Radiology("Radyoloj"),
    Genetics("Genetik"),
    Urology("Üroloji")
    ;

    private final String text;

    Specialization(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
