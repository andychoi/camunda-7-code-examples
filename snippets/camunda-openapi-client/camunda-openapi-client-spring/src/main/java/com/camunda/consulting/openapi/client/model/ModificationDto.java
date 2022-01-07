/*
 * Camunda Platform REST API
 * OpenApi Spec for Camunda Platform REST API.
 *
 * The version of the OpenAPI document: 7.16.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.camunda.consulting.openapi.client.model.MultipleProcessInstanceModificationInstructionDto;
import com.camunda.consulting.openapi.client.model.ProcessInstanceQueryDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ModificationDto
 */
@JsonPropertyOrder({
  ModificationDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  ModificationDto.JSON_PROPERTY_SKIP_CUSTOM_LISTENERS,
  ModificationDto.JSON_PROPERTY_SKIP_IO_MAPPINGS,
  ModificationDto.JSON_PROPERTY_PROCESS_INSTANCE_IDS,
  ModificationDto.JSON_PROPERTY_PROCESS_INSTANCE_QUERY,
  ModificationDto.JSON_PROPERTY_INSTRUCTIONS,
  ModificationDto.JSON_PROPERTY_ANNOTATION
})
@JsonTypeName("ModificationDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-19T11:53:20.948992+01:00[Europe/Berlin]")
public class ModificationDto {
  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private String processDefinitionId;

  public static final String JSON_PROPERTY_SKIP_CUSTOM_LISTENERS = "skipCustomListeners";
  private Boolean skipCustomListeners;

  public static final String JSON_PROPERTY_SKIP_IO_MAPPINGS = "skipIoMappings";
  private Boolean skipIoMappings;

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_IDS = "processInstanceIds";
  private List<String> processInstanceIds = null;

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_QUERY = "processInstanceQuery";
  private ProcessInstanceQueryDto processInstanceQuery;

  public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
  private List<MultipleProcessInstanceModificationInstructionDto> instructions = null;

  public static final String JSON_PROPERTY_ANNOTATION = "annotation";
  private String annotation;


  public ModificationDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definition for the modification
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition for the modification")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public ModificationDto skipCustomListeners(Boolean skipCustomListeners) {
    
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

   /**
   * Skip execution listener invocation for activities that are started or ended as part of this request.
   * @return skipCustomListeners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution listener invocation for activities that are started or ended as part of this request.")
  @JsonProperty(JSON_PROPERTY_SKIP_CUSTOM_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipCustomListeners() {
    return skipCustomListeners;
  }


  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }


  public ModificationDto skipIoMappings(Boolean skipIoMappings) {
    
    this.skipIoMappings = skipIoMappings;
    return this;
  }

   /**
   * Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.16/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request.
   * @return skipIoMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.16/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request.")
  @JsonProperty(JSON_PROPERTY_SKIP_IO_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipIoMappings() {
    return skipIoMappings;
  }


  public void setSkipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
  }


  public ModificationDto processInstanceIds(List<String> processInstanceIds) {
    
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public ModificationDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

   /**
   * A list of process instance ids to modify.
   * @return processInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of process instance ids to modify.")
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }


  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }


  public ModificationDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    
    this.processInstanceQuery = processInstanceQuery;
    return this;
  }

   /**
   * Get processInstanceQuery
   * @return processInstanceQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessInstanceQueryDto getProcessInstanceQuery() {
    return processInstanceQuery;
  }


  public void setProcessInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
  }


  public ModificationDto instructions(List<MultipleProcessInstanceModificationInstructionDto> instructions) {
    
    this.instructions = instructions;
    return this;
  }

  public ModificationDto addInstructionsItem(MultipleProcessInstanceModificationInstructionDto instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

   /**
   * An array of modification instructions. The instructions are executed in the order they are in. 
   * @return instructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of modification instructions. The instructions are executed in the order they are in. ")
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultipleProcessInstanceModificationInstructionDto> getInstructions() {
    return instructions;
  }


  public void setInstructions(List<MultipleProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
  }


  public ModificationDto annotation(String annotation) {
    
    this.annotation = annotation;
    return this;
  }

   /**
   * An arbitrary text annotation set by a user for auditing reasons.
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An arbitrary text annotation set by a user for auditing reasons.")
  @JsonProperty(JSON_PROPERTY_ANNOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnotation() {
    return annotation;
  }


  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationDto modificationDto = (ModificationDto) o;
    return Objects.equals(this.processDefinitionId, modificationDto.processDefinitionId) &&
        Objects.equals(this.skipCustomListeners, modificationDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, modificationDto.skipIoMappings) &&
        Objects.equals(this.processInstanceIds, modificationDto.processInstanceIds) &&
        Objects.equals(this.processInstanceQuery, modificationDto.processInstanceQuery) &&
        Objects.equals(this.instructions, modificationDto.instructions) &&
        Objects.equals(this.annotation, modificationDto.annotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, skipCustomListeners, skipIoMappings, processInstanceIds, processInstanceQuery, instructions, annotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationDto {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
