package uz.pdp.dataRest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.dataRest.entity.template.AbsEntity;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Measurement extends AbsEntity {
}
