/**
 * eventmobi
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: api-v2
 * Contact: support@cloud-elements.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.Eventmobi) {
      root.Eventmobi = {};
    }
    root.Eventmobi.ModelObject = factory(root.Eventmobi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ModelObject model module.
   * @module model/ModelObject
   * @version api-v2
   */

  /**
   * Constructs a new <code>ModelObject</code>.
   * Fields for the object. There will be fields associated with an Object, which are not all described here.
   * @alias module:model/ModelObject
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>ModelObject</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ModelObject} obj Optional instance to populate.
   * @return {module:model/ModelObject} The populated <code>ModelObject</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('objectField')) {
        obj['objectField'] = ApiClient.convertToType(data['objectField'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} objectField
   */
  exports.prototype['objectField'] = undefined;



  return exports;
}));


