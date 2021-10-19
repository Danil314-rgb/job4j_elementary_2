package oop.encapsulation;

import javax.xml.crypto.Data;
import java.util.Objects;

public class License {

    private String owner;
    private String model;
    private String code;
    private Data created;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Data getCreated() {
        return created;
    }

    public void setCreated(Data created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(owner, license.owner) && Objects.equals(model, license.model)
                && Objects.equals(code, license.code) && Objects.equals(created, license.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }
}
