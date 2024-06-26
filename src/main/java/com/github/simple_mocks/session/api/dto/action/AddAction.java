package com.github.simple_mocks.session.api.dto.action;

import com.github.simple_mocks.session.api.SessionErrors;
import lombok.Getter;

import java.io.Serializable;

/**
 * Action adds new attribute in session.<br/>
 * If attribute already exists in section when {@link SessionErrors#ALREADY_EXISTS} should be thrown.
 *
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
public final class AddAction extends Action {
    /**
     * Attribute value to add
     */
    private final Serializable attributeValue;

    /**
     * Construct action for adding attribute to section
     *
     * @param section        section code
     * @param attributeName  attribute name
     * @param attributeValue attribute value
     */
    public AddAction(String section, String attributeName, Serializable attributeValue) {
        super(section, attributeName);
        this.attributeValue = attributeValue;
    }
}
