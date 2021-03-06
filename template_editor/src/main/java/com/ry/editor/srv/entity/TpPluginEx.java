package com.ry.editor.srv.entity;

import com.tt.pwp.framework.data.model.DefaultDTO;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by KING on 2018/3/13.
 */
@Entity
@Table(name = "TP_PLUGIN_EX", schema = "EDITOR")
public class TpPluginEx extends DefaultDTO {
    //private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "FIELD_CODE")
    private String field_code;
    @Basic
    @Column(name = "FIELD_NAME")
    private String field_name;
    @Basic
    @Column(name = "FIELD_VALUE")
    private String field_value;
    @Basic
    @Column(name = "CREATE_TIME")
    private Date create_time;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public TpPluginEx() {
    }

    public TpPluginEx(Integer id, String field_code, String field_name, String field_value, Date create_time) {
        this.id = id;
        this.field_code = field_code;
        this.field_name = field_name;
        this.field_value = field_value;
        this.create_time = create_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpPluginEx that = (TpPluginEx) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (field_code != null ? !field_code.equals(that.field_code) : that.field_code != null) return false;
        if (field_name != null ? !field_name.equals(that.field_name) : that.field_name != null) return false;
        if (field_value != null ? !field_value.equals(that.field_value) : that.field_value != null) return false;
        return create_time != null ? create_time.equals(that.create_time) : that.create_time == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (field_code != null ? field_code.hashCode() : 0);
        result = 31 * result + (field_name != null ? field_name.hashCode() : 0);
        result = 31 * result + (field_value != null ? field_value.hashCode() : 0);
        result = 31 * result + (create_time != null ? create_time.hashCode() : 0);
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getField_code() {
        return field_code;
    }

    public void setField_code(String field_code) {
        this.field_code = field_code;
    }

    public String getField_name() {
        return field_name;
    }

    public void setField_name(String field_name) {
        this.field_name = field_name;
    }

    public String getField_value() {
        return field_value;
    }

    public void setField_value(String field_value) {
        this.field_value = field_value;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
