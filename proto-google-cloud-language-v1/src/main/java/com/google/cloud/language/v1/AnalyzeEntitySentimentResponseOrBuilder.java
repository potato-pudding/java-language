/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface AnalyzeEntitySentimentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  java.util.List<com.google.cloud.language.v1.Entity> getEntitiesList();
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  com.google.cloud.language.v1.Entity getEntities(int index);
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  int getEntitiesCount();
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1.EntityOrBuilder> getEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  com.google.cloud.language.v1.EntityOrBuilder getEntitiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
   * </pre>
   *
   * <code>string language = 2;</code>
   */
  java.lang.String getLanguage();
  /**
   *
   *
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
   * </pre>
   *
   * <code>string language = 2;</code>
   */
  com.google.protobuf.ByteString getLanguageBytes();
}
