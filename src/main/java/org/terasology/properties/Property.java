/*
 * Copyright 2012 Benjamin Glatzel <benjamin.glatzel@me.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.properties;

/**
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public class Property {

    private Object value;
    private Class valueType;
    private String title;

    public Property(String title, Object value) {
        this.title = title;
        setValue(value);
    }

    /**
     *
     * @return
     */
    public Object getValue() { return value; }

    /**
     *
     * @param value
     */
    public void setValue(Object value) {
        this.value = value;
        this.valueType = value.getClass();
    }

    /**
     *
     * @param value
     */
    public void setValue(Float value) {
        setValue((Object) value);
    }

    /**
     *
     * @param value
     */
    public void setValue(Double value) {
        setValue((Object) value);
    }

    /**
     *
     */
    public Class getValueType() {
        return valueType;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     */
    public String getTitle() {
        return title;
    }
}
