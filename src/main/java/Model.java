/**
 * Created by No3x on 28.08.2016.
 */
public class Model {
    private String team;
    private Integer spiele;
    private Integer tore ;
    private Integer gegentore;
    private Integer siege;
    private Integer niederlagen;
    private Integer team_id;

    public Model() {
        this.team = "Default Team";
        this.spiele = 0;
        this.tore = 0;
        this.gegentore = 0;
        this.siege = 0;
        this.niederlagen = 0;
        this.team_id = 0;
    }

    public Model(String team, Integer spiele, Integer tore, Integer gegentore, Integer siege, Integer niederlagen, Integer team_id) {
        this.team = team;
        this.spiele = spiele;
        this.tore = tore;
        this.gegentore = gegentore;
        this.siege = siege;
        this.niederlagen = niederlagen;
        this.team_id = team_id;
    }

    public String getTeam() {
        return this.team;
    }

    public Integer getSpiele() {
        return this.spiele;
    }

    public Integer getTore() {
        return this.tore;
    }

    public Integer getGegentore() {
        return this.gegentore;
    }

    public Integer getSiege() {
        return this.siege;
    }

    public Integer getNiederlagen() {
        return this.niederlagen;
    }

    public Integer getTeam_id() {
        return this.team_id;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setSpiele(Integer spiele) {
        this.spiele = spiele;
    }

    public void setTore(Integer tore) {
        this.tore = tore;
    }

    public void setGegentore(Integer gegentore) {
        this.gegentore = gegentore;
    }

    public void setSiege(Integer siege) {
        this.siege = siege;
    }

    public void setNiederlagen(Integer niederlagen) {
        this.niederlagen = niederlagen;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Model)) return false;
        final Model other = (Model) o;
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
        final Object this$spiele = this.getSpiele();
        final Object other$spiele = other.getSpiele();
        if (this$spiele == null ? other$spiele != null : !this$spiele.equals(other$spiele)) return false;
        final Object this$tore = this.getTore();
        final Object other$tore = other.getTore();
        if (this$tore == null ? other$tore != null : !this$tore.equals(other$tore)) return false;
        final Object this$gegentore = this.getGegentore();
        final Object other$gegentore = other.getGegentore();
        if (this$gegentore == null ? other$gegentore != null : !this$gegentore.equals(other$gegentore)) return false;
        final Object this$siege = this.getSiege();
        final Object other$siege = other.getSiege();
        if (this$siege == null ? other$siege != null : !this$siege.equals(other$siege)) return false;
        final Object this$niederlagen = this.getNiederlagen();
        final Object other$niederlagen = other.getNiederlagen();
        if (this$niederlagen == null ? other$niederlagen != null : !this$niederlagen.equals(other$niederlagen))
            return false;
        final Object this$team_id = this.getTeam_id();
        final Object other$team_id = other.getTeam_id();
        if (this$team_id == null ? other$team_id != null : !this$team_id.equals(other$team_id)) return false;
        return true;
    }

    public String toString() {
        return "Model(team=" + this.getTeam() + ", spiele=" + this.getSpiele() + ", tore=" + this.getTore() + ", gegentore=" + this.getGegentore() + ", siege=" + this.getSiege() + ", niederlagen=" + this.getNiederlagen() + ", team_id=" + this.getTeam_id() + ")";
    }

    public static ModelBuilder builder() {
        return new ModelBuilder();
    }

    public static class ModelBuilder {
        private String team;
        private Integer spiele;
        private Integer tore;
        private Integer gegentore;
        private Integer siege;
        private Integer niederlagen;
        private Integer team_id;

        ModelBuilder() {
        }

        public Model.ModelBuilder team(String team) {
            this.team = team;
            return this;
        }

        public Model.ModelBuilder spiele(Integer spiele) {
            this.spiele = spiele;
            return this;
        }

        public Model.ModelBuilder tore(Integer tore) {
            this.tore = tore;
            return this;
        }

        public Model.ModelBuilder gegentore(Integer gegentore) {
            this.gegentore = gegentore;
            return this;
        }

        public Model.ModelBuilder siege(Integer siege) {
            this.siege = siege;
            return this;
        }

        public Model.ModelBuilder niederlagen(Integer niederlagen) {
            this.niederlagen = niederlagen;
            return this;
        }

        public Model.ModelBuilder team_id(Integer team_id) {
            this.team_id = team_id;
            return this;
        }

        public Model build() {
            return new Model(team, spiele, tore, gegentore, siege, niederlagen, team_id);
        }

        public String toString() {
            return "Model.ModelBuilder(team=" + this.team + ", spiele=" + this.spiele + ", tore=" + this.tore + ", gegentore=" + this.gegentore + ", siege=" + this.siege + ", niederlagen=" + this.niederlagen + ", team_id=" + this.team_id + ")";
        }
    }
}
