package uz.pdp.dataRest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.dataRest.entity.template.AbsEntity;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Warehouse extends AbsEntity {
}
