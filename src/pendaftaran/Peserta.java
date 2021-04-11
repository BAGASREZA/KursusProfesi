package pendaftaran;

public class Peserta {
    public String cekKelayakan(double nilaiMatematika,double nilaiFisika,double nilaiKimia){
        String kelayakan;
        if (nilaiMatematika >= 65 && nilaiFisika >= 55 && nilaiKimia >= 50){
            kelayakan = "layak ikut kursus";
        } else if (nilaiMatematika + nilaiFisika + nilaiKimia >= 190){
            kelayakan = "layak ikut kursus";
        } else if (nilaiMatematika + nilaiFisika >= 140){
            kelayakan = "layak ikut kursus";
        } else{
            kelayakan = "tidak layak ikut kursus";
        }
        return kelayakan;
    }
}
