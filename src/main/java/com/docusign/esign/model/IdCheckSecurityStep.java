package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IdCheckSecurityStep
 */

public class IdCheckSecurityStep {
  @JsonProperty("authType")
  private String authType = null;

  public IdCheckSecurityStep authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * 
   * @return authType
  **/
  @ApiModelProperty(value = "")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdCheckSecurityStep idCheckSecurityStep = (IdCheckSecurityStep) o;
    return Objects.equals(this.authType, idCheckSecurityStep.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdCheckSecurityStep {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

