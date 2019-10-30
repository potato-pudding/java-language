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

public interface PartOfSpeechOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.PartOfSpeech)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The part of speech tag.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Tag tag = 1;</code>
   */
  int getTagValue();
  /**
   *
   *
   * <pre>
   * The part of speech tag.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Tag tag = 1;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Tag getTag();

  /**
   *
   *
   * <pre>
   * The grammatical aspect.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Aspect aspect = 2;</code>
   */
  int getAspectValue();
  /**
   *
   *
   * <pre>
   * The grammatical aspect.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Aspect aspect = 2;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Aspect getAspect();

  /**
   *
   *
   * <pre>
   * The grammatical case.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Case case = 3;</code>
   */
  int getCaseValue();
  /**
   *
   *
   * <pre>
   * The grammatical case.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Case case = 3;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Case getCase();

  /**
   *
   *
   * <pre>
   * The grammatical form.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Form form = 4;</code>
   */
  int getFormValue();
  /**
   *
   *
   * <pre>
   * The grammatical form.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Form form = 4;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Form getForm();

  /**
   *
   *
   * <pre>
   * The grammatical gender.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Gender gender = 5;</code>
   */
  int getGenderValue();
  /**
   *
   *
   * <pre>
   * The grammatical gender.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Gender gender = 5;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Gender getGender();

  /**
   *
   *
   * <pre>
   * The grammatical mood.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Mood mood = 6;</code>
   */
  int getMoodValue();
  /**
   *
   *
   * <pre>
   * The grammatical mood.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Mood mood = 6;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Mood getMood();

  /**
   *
   *
   * <pre>
   * The grammatical number.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Number number = 7;</code>
   */
  int getNumberValue();
  /**
   *
   *
   * <pre>
   * The grammatical number.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Number number = 7;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Number getNumber();

  /**
   *
   *
   * <pre>
   * The grammatical person.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Person person = 8;</code>
   */
  int getPersonValue();
  /**
   *
   *
   * <pre>
   * The grammatical person.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Person person = 8;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Person getPerson();

  /**
   *
   *
   * <pre>
   * The grammatical properness.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Proper proper = 9;</code>
   */
  int getProperValue();
  /**
   *
   *
   * <pre>
   * The grammatical properness.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Proper proper = 9;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Proper getProper();

  /**
   *
   *
   * <pre>
   * The grammatical reciprocity.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Reciprocity reciprocity = 10;</code>
   */
  int getReciprocityValue();
  /**
   *
   *
   * <pre>
   * The grammatical reciprocity.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Reciprocity reciprocity = 10;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Reciprocity getReciprocity();

  /**
   *
   *
   * <pre>
   * The grammatical tense.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Tense tense = 11;</code>
   */
  int getTenseValue();
  /**
   *
   *
   * <pre>
   * The grammatical tense.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Tense tense = 11;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Tense getTense();

  /**
   *
   *
   * <pre>
   * The grammatical voice.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Voice voice = 12;</code>
   */
  int getVoiceValue();
  /**
   *
   *
   * <pre>
   * The grammatical voice.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Voice voice = 12;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech.Voice getVoice();
}
