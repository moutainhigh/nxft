package com.wit.fxp.nxft.domain.model.subject.metadata.client;

import com.benewit.entity.Entity;
import com.benewit.entity.metadata.client.AbstractEntityClientMetadata;
import com.benewit.objecttree.ObjectNode;
import com.benewit.objecttree.ObjectTree;
import com.wit.fxp.nxft.domain.model.subject.NxftSubjectFoodProhibit;

// CHECKSTYLE:OFF

/**
 * 客户端元数据，用于获取非叶子节点。通常在Facade中调用。
 *
 * @author Benewit Code Generator V1.0
 * @since 1.0
 *
 * @param <T>
 */
public class NxftSubjectFoodProhibitClientMetadata<T extends Entity> extends AbstractEntityClientMetadata<T> {

    /*
     * 本程序不允许修改！！！
     *
     * Created by Benewit Code Generator V1.0
     *  codegen/templates//java/java-entdomainmdc.template
     */

    // constructor
    private NxftSubjectFoodProhibitClientMetadata(Class<T> rootClass) {
        super(rootClass);
    }

    // constructor
    public NxftSubjectFoodProhibitClientMetadata(ObjectTree<T> ot, ObjectNode<T> node) {
        super(ot, node);
    }

    /**
     * 创建客户端的根元数据
     *
     * @return 作为根的[NxftSubjectFoodProhibit]元数据
     */
    public static NxftSubjectFoodProhibitClientMetadata<NxftSubjectFoodProhibit> root() {
        return new NxftSubjectFoodProhibitClientMetadata<NxftSubjectFoodProhibit>(NxftSubjectFoodProhibit.class);
    }

    /**
     * @return [食物禁忌id]属性名
     */
    public String foodProhibitId() {
        return getNode().isRoot()
                ? "foodProhibitId"
                : getNode().getPath().toPropertyPath() + ".foodProhibitId";
    }

    /**
     * @return [食物禁忌名称]属性名
     */
    public String foodProhibitName() {
        return getNode().isRoot()
                ? "foodProhibitName"
                : getNode().getPath().toPropertyPath() + ".foodProhibitName";
    }

    /**
     * @return [是否是其他项 Y/N  其他项需手工输入备注]属性名
     */
    public String isother() {
        return getNode().isRoot()
                ? "isother"
                : getNode().getPath().toPropertyPath() + ".isother";
    }

    /**
     * @return [对象id]属性名
     */
    public String subjectId() {
        return getNode().isRoot()
                ? "subjectId"
                : getNode().getPath().toPropertyPath() + ".subjectId";
    }

    /**
     * @return [备注]属性名
     */
    public String foodProhibitDesc() {
        return getNode().isRoot()
                ? "foodProhibitDesc"
                : getNode().getPath().toPropertyPath() + ".foodProhibitDesc";
    }
}
