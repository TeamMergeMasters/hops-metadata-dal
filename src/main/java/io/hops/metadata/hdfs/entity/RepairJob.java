/*
 * Copyright (C) 2015 hops.io.
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
package io.hops.metadata.hdfs.entity;

public class RepairJob {
  private String jtIdentifier;
  private int jobId;
  private String path;
  private String inDir;
  private String outDir;

  public RepairJob() {
  }

  public RepairJob(String jtIdentifier, int jobId) {
    this.jtIdentifier = jtIdentifier;
    this.jobId = jobId;
  }

  public RepairJob(String jtIdentifier, int jobId, String path,
      String inDir, String outDir) {
    this.jtIdentifier = jtIdentifier;
    this.jobId = jobId;
    this.path = path;
    this.inDir = inDir;
    this.outDir = outDir;
  }

  public String getJtIdentifier() {
    return jtIdentifier;
  }

  public void setJtIdentifier(String jtIdentifier) {
    this.jtIdentifier = jtIdentifier;
  }

  public int getJobId() {
    return jobId;
  }

  public void setJobId(int jobId) {
    this.jobId = jobId;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getInDir() {
    return inDir;
  }

  public void setInDir(String inDir) {
    this.inDir = inDir;
  }

  public String getOutDir() {
    return outDir;
  }

  public void setOutDir(String outDir) {
    this.outDir = outDir;
  }
}
