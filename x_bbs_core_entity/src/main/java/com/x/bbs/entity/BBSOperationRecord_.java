/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.bbs.entity.BBSOperationRecord.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 10:08:02 CST 2017")
public class BBSOperationRecord_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<BBSOperationRecord,Date> createTime;
    public static volatile SingularAttribute<BBSOperationRecord,String> forumId;
    public static volatile SingularAttribute<BBSOperationRecord,String> forumName;
    public static volatile SingularAttribute<BBSOperationRecord,String> hostIp;
    public static volatile SingularAttribute<BBSOperationRecord,String> hostname;
    public static volatile SingularAttribute<BBSOperationRecord,String> id;
    public static volatile SingularAttribute<BBSOperationRecord,String> mainSectionId;
    public static volatile SingularAttribute<BBSOperationRecord,String> mainSectionName;
    public static volatile SingularAttribute<BBSOperationRecord,String> objectId;
    public static volatile SingularAttribute<BBSOperationRecord,String> objectName;
    public static volatile SingularAttribute<BBSOperationRecord,String> objectType;
    public static volatile SingularAttribute<BBSOperationRecord,String> operatorName;
    public static volatile SingularAttribute<BBSOperationRecord,String> optType;
    public static volatile SingularAttribute<BBSOperationRecord,String> sectionId;
    public static volatile SingularAttribute<BBSOperationRecord,String> sectionName;
    public static volatile SingularAttribute<BBSOperationRecord,String> sequence;
    public static volatile SingularAttribute<BBSOperationRecord,String> subjectId;
    public static volatile SingularAttribute<BBSOperationRecord,String> title;
    public static volatile SingularAttribute<BBSOperationRecord,Date> updateTime;
}