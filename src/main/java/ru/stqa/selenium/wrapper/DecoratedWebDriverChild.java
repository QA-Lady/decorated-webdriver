/*
 * Copyright 2016 Alexei Barantsev
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package ru.stqa.selenium.wrapper;

public class DecoratedWebDriverChild<T> extends DecoratedByReflection<T> {

  private final DecoratedWebDriver decoratedDriver;

  public DecoratedWebDriverChild(DecoratedWebDriver decoratedDriver, T original) {
    super(original);
    this.decoratedDriver = decoratedDriver;
  }

  @Override
  public Topmost getTopmostDecorated() {
    return decoratedDriver;
  }

  public DecoratedWebDriver getDriverWrapper() {
    return decoratedDriver;
  }

}