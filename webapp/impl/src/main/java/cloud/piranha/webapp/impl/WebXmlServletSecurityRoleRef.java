/*
 * Copyright (c) 2002-2020 Manorrock.com. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   1. Redistributions of source code must retain the above copyright notice,
 *      this list of conditions and the following disclaimer.
 *   2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *   3. Neither the name of the copyright holder nor the names of its
 *      contributors may be used to endorse or promote products derived from
 *      this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package cloud.piranha.webapp.impl;

/**
 * The web.xml servlet security-role-ref element.
 *
 * @author Arjan Tijms
 */
public class WebXmlServletSecurityRoleRef {

    /**
     * The role scoped to a specific servlet, and the role uses in <code>isUser/CallerInRole</code> methods.
     */
    private String roleName;

    /**
     * The "global" application role, as defined by <code>declareRoles</code> or <code>security-role</code>
     */
    private String roleLink;

    /**
     * Get the role name.
     * 
     * @return the role name.
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Set the role name.
     * 
     * @param roleName the role name.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Get the role link.
     * 
     * @return the role link.
     */
    public String getRoleLink() {
        return roleLink;
    }

    /**
     * Set the role link.
     * 
     * @param roleLink the role link.
     */
    public void setRoleLink(String roleLink) {
        this.roleLink = roleLink;
    }
}
