/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.toolkit.tls.commandLine;

public enum ExitCode {
    SUCCESS,
    HELP,
    INVALID_ARGS,
    SERVICE_ERROR,
    ERROR_PARSING_COMMAND_LINE,
    ERROR_GENERATING_CONFIG,
    ERROR_SAME_KEY_AND_KEY_PASSWORD,
    ERROR_INCORRECT_NUMBER_OF_PASSWORDS,
    ERROR_PARSING_INT_ARG,
    ERROR_TOKEN_ARG_EMPTY,
    ERROR_READING_NIFI_PROPERTIES
}
