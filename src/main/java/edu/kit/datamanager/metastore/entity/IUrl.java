/*
 * Copyright 2018 Karlsruhe Institute of Technology.
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
package edu.kit.datamanager.metastore.entity;

/**
 * Interface to get and set URL of an instance.
 * @author hartmann-v
 */
public interface IUrl {

  /**
   * Set URL of a file.
   *
   * @param url URL to set.
   */
  public void setUrl(String url);

  /**
   * Get URL of a file.
   *
   * @return URL of the file.
   */
  public String getUrl();
}