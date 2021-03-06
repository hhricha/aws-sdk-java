/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The five most recent communications associated with the case.
 * </p>
 */
public class RecentCaseCommunications implements Serializable, Cloneable {

    /**
     * <p>
     * The five most recent communications associated with the case.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Communication> communications;
    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The five most recent communications associated with the case.
     * </p>
     * 
     * @return The five most recent communications associated with the case.
     */

    public java.util.List<Communication> getCommunications() {
        if (communications == null) {
            communications = new com.amazonaws.internal.SdkInternalList<Communication>();
        }
        return communications;
    }

    /**
     * <p>
     * The five most recent communications associated with the case.
     * </p>
     * 
     * @param communications
     *        The five most recent communications associated with the case.
     */

    public void setCommunications(
            java.util.Collection<Communication> communications) {
        if (communications == null) {
            this.communications = null;
            return;
        }

        this.communications = new com.amazonaws.internal.SdkInternalList<Communication>(
                communications);
    }

    /**
     * <p>
     * The five most recent communications associated with the case.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCommunications(java.util.Collection)} or
     * {@link #withCommunications(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param communications
     *        The five most recent communications associated with the case.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RecentCaseCommunications withCommunications(
            Communication... communications) {
        if (this.communications == null) {
            setCommunications(new com.amazonaws.internal.SdkInternalList<Communication>(
                    communications.length));
        }
        for (Communication ele : communications) {
            this.communications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The five most recent communications associated with the case.
     * </p>
     * 
     * @param communications
     *        The five most recent communications associated with the case.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RecentCaseCommunications withCommunications(
            java.util.Collection<Communication> communications) {
        setCommunications(communications);
        return this;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @param nextToken
     *        A resumption point for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @return A resumption point for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @param nextToken
     *        A resumption point for pagination.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RecentCaseCommunications withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCommunications() != null)
            sb.append("Communications: " + getCommunications() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecentCaseCommunications == false)
            return false;
        RecentCaseCommunications other = (RecentCaseCommunications) obj;
        if (other.getCommunications() == null
                ^ this.getCommunications() == null)
            return false;
        if (other.getCommunications() != null
                && other.getCommunications().equals(this.getCommunications()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCommunications() == null) ? 0 : getCommunications()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public RecentCaseCommunications clone() {
        try {
            return (RecentCaseCommunications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
