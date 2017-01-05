/**
 * Copyright (C) 2016-2017 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.cii.d16b;

import javax.annotation.Nonnull;

import com.helger.commons.annotation.Singleton;
import com.helger.xml.CXML;
import com.helger.xml.namespace.MapBasedNamespaceContext;

/**
 * The namespace context to be used as the namespace prefix mapper.
 *
 * @author Philip Helger
 */
@Singleton
public class CIID16BNamespaceContext extends MapBasedNamespaceContext
{
  private static final class SingletonHolder
  {
    static final CIID16BNamespaceContext s_aInstance = new CIID16BNamespaceContext ();
  }

  protected CIID16BNamespaceContext ()
  {
    addMapping ("xsi", CXML.XML_NS_XSI);
    addMapping ("xs", CXML.XML_NS_XSD);
    addMapping ("rsm", CCIID16B.XML_SCHEMA_RSM_NAMESPACE_URL);
    addMapping ("ccts", CCIID16B.XML_SCHEMA_CCTS_NAMESPACE_URL);
    addMapping ("udt", CCIID16B.XML_SCHEMA_UDT_NAMESPACE_URL);
    addMapping ("qdt", CCIID16B.XML_SCHEMA_QDT_NAMESPACE_URL);
    addMapping ("ram", CCIID16B.XML_SCHEMA_RAM_NAMESPACE_URL);
  }

  @Nonnull
  public static CIID16BNamespaceContext getInstance ()
  {
    return SingletonHolder.s_aInstance;
  }
}
