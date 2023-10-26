package model;

public class Seleccion {
    private String pais;
    private String id;
    private String rankingfifa;


    public Seleccion(String pais, String id, String rankingfifa) {
        this.pais = pais;
        this.id = id;
        this.rankingfifa = rankingfifa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRankingfifa() {
        return rankingfifa;
    }

    public void setRankingfifa(String rankingfifa) {
        this.rankingfifa = rankingfifa;
    }

    @Override
    public String toString() {
        return "Seleccion{" +
                "pais='" + pais + '\'' +
                ", id='" + id + '\'' +
                ", rankingfifa='" + rankingfifa + '\'' +
                '}';
    }
}
