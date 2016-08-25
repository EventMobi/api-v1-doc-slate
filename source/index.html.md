---
title: eventmobi api-v2

search: true
---

# EventMobi API Documentation V1.1
## Send em attendee info to sfdc opportunity

```http
GET /elements/api-v2/hubs/event/actions/SFDC/SyncAttendeeOpportunity HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "response": {
        "custom_fields_names": [
            {
                "type_name": "string",
                "event_id": "string",
                "deleted": "string",
                "section_id": "string",
                "visibility": "string",
                "type_id": "string",
                "edit_permissions": "string",
                "name": "string",
                "id": "string",
                "position": "string",
                "validation_id": "string"
            }
        ],
        "type": "string",
        "color_class": "string",
        "url": "string",
        "event_id": "integer",
        "name": "string",
        "icon_class": "string",
        "id": "integer",
        "page": "string",
        "position": "integer",
        "items": [
            {
                "website": "string",
                "blockMessaging": "string",
                "image50": "string",
                "facebook": "string",
                "about": "string",
                "external_id": "string",
                "linkedin": "string",
                "title": "string",
                "url": "string",
                "twitter": "string",
                "image100": "string",
                "custom_fields_values": [
                    {
                        "field_id": "string",
                        "event_id": "string",
                        "deleted": "string",
                        "visibility": "string",
                        "section_id": "string",
                        "type_id": "string",
                        "owner_id": "string",
                        "edit_permissions": "string",
                        "name": "string",
                        "id": "string",
                        "value": "string",
                        "owner_type": "string"
                    }
                ],
                "company_name": "string",
                "id": "string",
                "first_name": "string",
                "email": "string"
            }
        ],
        "config": {
            "hide_regular_fields": "boolean",
            "custom_fields_enabled": "boolean"
        },
        "status": "integer"
    },
    "status": "string",
    "timestamp": "integer"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[actionSFDCSyncAttendeeOpportunity](#actionsfdcsyncattendeeopportunity)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
</table>

## Test

```http
GET /elements/api-v2/hubs/event/attendees HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "custom_fields_names": [
        {
            "type_name": "string",
            "event_id": "string",
            "deleted": "string",
            "section_id": "string",
            "visibility": "string",
            "type_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "position": "string",
            "validation_id": "string"
        }
    ],
    "type": "string",
    "color_class": "string",
    "url": "string",
    "event_id": "integer",
    "name": "string",
    "icon_class": "string",
    "id": "integer",
    "page": "string",
    "position": "integer",
    "items": [
        {
            "website": "string",
            "blockMessaging": "string",
            "image50": "string",
            "facebook": "string",
            "about": "string",
            "external_id": "string",
            "linkedin": "string",
            "title": "string",
            "url": "string",
            "twitter": "string",
            "image100": "string",
            "custom_fields_values": [
                {
                    "field_id": "string",
                    "event_id": "string",
                    "deleted": "string",
                    "visibility": "string",
                    "section_id": "string",
                    "type_id": "string",
                    "owner_id": "string",
                    "edit_permissions": "string",
                    "name": "string",
                    "id": "string",
                    "value": "string",
                    "owner_type": "string"
                }
            ],
            "company_name": "string",
            "id": "string",
            "first_name": "string",
            "email": "string"
        }
    ],
    "config": {
        "hide_regular_fields": "boolean",
        "custom_fields_enabled": "boolean"
    },
    "status": "integer"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[attendees](#attendees)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
</table>

## Get attendee list

```http
GET /elements/api-v2/hubs/event/attendees/{SectionID} HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "custom_fields_names": [
        {
            "type_name": "string",
            "event_id": "string",
            "deleted": "string",
            "section_id": "string",
            "visibility": "string",
            "type_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "position": "string",
            "validation_id": "string"
        }
    ],
    "type": "string",
    "color_class": "string",
    "url": "string",
    "event_id": "integer",
    "name": "string",
    "icon_class": "string",
    "id": "integer",
    "page": "string",
    "position": "integer",
    "items": [
        {
            "website": "string",
            "blockMessaging": "string",
            "image50": "string",
            "facebook": "string",
            "about": "string",
            "external_id": "string",
            "linkedin": "string",
            "title": "string",
            "url": "string",
            "twitter": "string",
            "image100": "string",
            "custom_fields_values": [
                {
                    "field_id": "string",
                    "event_id": "string",
                    "deleted": "string",
                    "visibility": "string",
                    "section_id": "string",
                    "type_id": "string",
                    "owner_id": "string",
                    "edit_permissions": "string",
                    "name": "string",
                    "id": "string",
                    "value": "string",
                    "owner_type": "string"
                }
            ],
            "company_name": "string",
            "id": "string",
            "first_name": "string",
            "email": "string"
        }
    ],
    "config": {
        "hide_regular_fields": "boolean",
        "custom_fields_enabled": "boolean"
    },
    "status": "integer"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
SectionID<b title="required">&nbsp;*&nbsp;</b> | path | string | 
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[attendees](#attendees)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
</table>

## Get attendee data

```http
GET /elements/api-v2/hubs/event/attendees/{SectionID}/people/{ItemID} HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "website": "string",
    "image50": "string",
    "facebook": "string",
    "about": "string",
    "external_id": "string",
    "linkedin": "string",
    "title": "string",
    "url": "string",
    "twitter": "string",
    "image100": "string",
    "custom_fields_values": [
        {
            "field_id": "string",
            "event_id": "string",
            "deleted": "string",
            "visibility": "string",
            "section_id": "string",
            "type_id": "string",
            "owner_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "value": "string",
            "owner_type": "string"
        }
    ],
    "company_name": "string",
    "id": "string",
    "first_name": "string",
    "email": "string"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
SectionID<b title="required">&nbsp;*&nbsp;</b> | path | string | 
ItemID<b title="required">&nbsp;*&nbsp;</b> | path | string | 
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[attendeesPeople](#attendeespeople)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
</table>

## Get a list of all the available objects.

```http
GET /elements/api-v2/hubs/event/objects HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    "string"
]
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>array[string]</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>

## Get a list of all the field for an object.

```http
GET /elements/api-v2/hubs/event/objects/{objectName}/metadata HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "fields": [
        {
            "mask": "string",
            "type": "string",
            "vendorDisplayName": "string",
            "vendorPath": "string",
            "vendorReadOnly": "boolean",
            "vendorRequired": "boolean"
        }
    ]
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[objectsMetadata](#objectsmetadata)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>

## Ping the element to confirm that the hub element has a heartbeat.  if the element does not have a heartbeat, an error message will be returned.

```http
GET /elements/api-v2/hubs/event/ping HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "dateTime": "string",
    "endpoint": "string"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[Pong](#pong)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>

## Get sections

```http
GET /elements/api-v2/hubs/event/sections HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "partner_name": "string",
        "type": "string",
        "color_class": "string",
        "url": "string",
        "event_id": "integer",
        "name": "string",
        "icon_class": "string",
        "id": "integer",
        "page": "string",
        "position": "integer",
        "partner_token": "string",
        "show_ads": "boolean",
        "status": "integer"
    }
]
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>array[[sectionsListObject](#sectionslistobject)]</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
</table>

## Get item info

```http
GET /elements/api-v2/hubs/event/sections/{section-id}/items/{item-id} HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "website": "string",
    "image50": "string",
    "facebook": "string",
    "about": "string",
    "external_id": "string",
    "linkedin": "string",
    "title": "string",
    "url": "string",
    "twitter": "string",
    "image100": "string",
    "custom_fields_values": [
        {
            "field_id": "string",
            "event_id": "string",
            "deleted": "string",
            "visibility": "string",
            "section_id": "string",
            "type_id": "string",
            "owner_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "value": "string",
            "owner_type": "string"
        }
    ],
    "company_name": "string",
    "id": "string",
    "first_name": "string",
    "threetopics": "string",
    "email": "string"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
section-id<b title="required">&nbsp;*&nbsp;</b> | path | string | 
item-id<b title="required">&nbsp;*&nbsp;</b> | path | string | 
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[sectionsItems](#sectionsitems)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
</table>

## Get specific section info in v1 format

```http
GET /elements/api-v2/hubs/event/sections/{sectionID} HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "response": {
        "custom_fields_names": [
            {
                "type_name": "string",
                "event_id": "string",
                "deleted": "string",
                "section_id": "string",
                "visibility": "string",
                "type_id": "string",
                "edit_permissions": "string",
                "name": "string",
                "id": "string",
                "position": "string",
                "validation_id": "string"
            }
        ],
        "type": "string",
        "color_class": "string",
        "url": "string",
        "event_id": "integer",
        "name": "string",
        "icon_class": "string",
        "id": "integer",
        "page": "string",
        "position": "integer",
        "items": [
            {
                "website": "string",
                "blockMessaging": "string",
                "image50": "string",
                "facebook": "string",
                "about": "string",
                "external_id": "string",
                "linkedin": "string",
                "title": "string",
                "url": "string",
                "twitter": "string",
                "image100": "string",
                "custom_fields_values": [
                    {
                        "field_id": "string",
                        "event_id": "string",
                        "deleted": "string",
                        "visibility": "string",
                        "section_id": "string",
                        "type_id": "string",
                        "owner_id": "string",
                        "edit_permissions": "string",
                        "name": "string",
                        "id": "string",
                        "value": "string",
                        "owner_type": "string"
                    }
                ],
                "company_name": "string",
                "id": "string",
                "first_name": "string",
                "email": "string"
            }
        ],
        "config": {
            "hide_regular_fields": "boolean",
            "custom_fields_enabled": "boolean"
        },
        "status": "integer"
    },
    "status": "string",
    "timestamp": "integer"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
sectionID<b title="required">&nbsp;*&nbsp;</b> | path | string | The section ID. (You can get from /configuration or /sections request)
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[sections](#sections)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
</table>

## Search for {objectname}

```http
GET /elements/api-v2/hubs/event/{objectName} HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "objectField": "string"
    }
]
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
where | query | string | The CEQL search expression.
page | query | integer | The page number. Defaults to 1 if not provided.
pageSize | query | integer | The page size. Defaults to 200 if not provided. Maximum of 5000.
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>array[[Object](#object)]</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>
## Create an {objectname}

```http
POST /elements/api-v2/hubs/event/{objectName} HTTP/1.1
Content-Type: application/json

{
    "Body": {
        "objectField": "string"
    }
}
```
```http
HTTP/1.1 200 OK
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
Body<b title="required">&nbsp;*&nbsp;</b> | body | [Object](#object) | The {objectName}
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>no content</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>

## Retrieve an {objectname}

```http
GET /elements/api-v2/hubs/event/{objectName}/{objectId} HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "objectField": "string"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
objectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {objectName} ID
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[Object](#object)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>
## Update an {objectname}

```http
PUT /elements/api-v2/hubs/event/{objectName}/{objectId} HTTP/1.1
Content-Type: application/json

{
    "Body": {
        "objectField": "string"
    }
}
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "objectField": "string"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
objectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {objectName} ID
Body<b title="required">&nbsp;*&nbsp;</b> | body | [Object](#object) | The {objectName}
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[Object](#object)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>
## Delete an {objectname}

```http
DELETE /elements/api-v2/hubs/event/{objectName}/{objectId} HTTP/1.1
```
```http
HTTP/1.1 200 OK
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
objectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {objectName} ID
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>no content</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &#039;Accept&#039; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>

## Search for {childobjectname}

```http
GET /elements/api-v2/hubs/event/{objectName}/{objectId}/{childObjectName} HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "objectField": "string"
    }
]
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
objectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {objectName} ID
childObjectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the childObjectName
where | query | string | The CEQL search expression.
page | query | integer | The page number. Defaults to 1 if not provided.
pageSize | query | integer | The page size. Defaults to 200 if not provided. Maximum of 5000.
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>array[[Object](#object)]</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &amp;quot;Accept&amp;quot; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>
## Create an {childobjectname}

```http
POST /elements/api-v2/hubs/event/{objectName}/{objectId}/{childObjectName} HTTP/1.1
Content-Type: application/json

{
    "Body": {
        "objectField": "string"
    }
}
```
```http
HTTP/1.1 200 OK
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
objectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {objectName} ID
childObjectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
Body<b title="required">&nbsp;*&nbsp;</b> | body | [Object](#object) | The {childObjectName}
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>no content</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &amp;quot;Accept&amp;quot; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>

## Retrieve an {childobjectname}

```http
GET /elements/api-v2/hubs/event/{objectName}/{objectId}/{childObjectName}/{childObjectId} HTTP/1.1
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "objectField": "string"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
childObjectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the childObjectName
objectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {objectName} ID
childObjectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {childObjectName} ID
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[Object](#object)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &amp;quot;Accept&amp;quot; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>
## Update an {childobjectname}

```http
PUT /elements/api-v2/hubs/event/{objectName}/{objectId}/{childObjectName}/{childObjectId} HTTP/1.1
Content-Type: application/json

{
    "Body": {
        "objectField": "string"
    }
}
```
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "objectField": "string"
}
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
childObjectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the childObjectName
objectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {objectName} ID
childObjectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {childObjectName} ID
Body<b title="required">&nbsp;*&nbsp;</b> | body | [Object](#object) | The {objectName}
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>[Object](#object)</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &amp;quot;Accept&amp;quot; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>
## Delete an {childobjectname}

```http
DELETE /elements/api-v2/hubs/event/{objectName}/{objectId}/{childObjectName}/{childObjectId} HTTP/1.1
```
```http
HTTP/1.1 200 OK
```
```http
HTTP/1.1 400 Bad Request
```
```http
HTTP/1.1 401 Unauthorized
```
```http
HTTP/1.1 403 Forbidden
```
```http
HTTP/1.1 404 Not Found
```
```http
HTTP/1.1 405 Method Not Allowed
```
```http
HTTP/1.1 406 Not Acceptable
```
```http
HTTP/1.1 409 Conflict
```
```http
HTTP/1.1 415 Unsupported Media Type
```
```http
HTTP/1.1 500 Internal Server Error
```
```http
HTTP/1.1 502 Bad Gateway
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
Authorization<b title="required">&nbsp;*&nbsp;</b> | header | string | The authorization tokens. The format for the header value is &#039;Element &amp;lt;token&amp;gt;, User &amp;lt;user secret&amp;gt;&#039;
objectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the object
childObjectName<b title="required">&nbsp;*&nbsp;</b> | path | string | The name of the childObjectName
objectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {objectName} ID
childObjectId<b title="required">&nbsp;*&nbsp;</b> | path | string | The {childObjectName} ID
//todo: migrate to html tables. after cool looking nested table
### Responses
<span comment="workaround for markdown processing in table"></span>
<table>
<tr><th>Http code</th><th>Type</th><th>Description</th></tr>
<tr><td>200</td><td>no content</td><td>OK - Everything worked as expected</td></tr> 
<tr><td>400</td><td>no content</td><td>Bad Request - Often due to a missing request parameter</td></tr> 
<tr><td>401</td><td>no content</td><td>Unauthorized - An invalid element token, user secret and/or org secret provided</td></tr> 
<tr><td>403</td><td>no content</td><td>Forbidden - Access to the resource by the provider is forbidden</td></tr> 
<tr><td>404</td><td>no content</td><td>Not found - The requested resource is not found</td></tr> 
<tr><td>405</td><td>no content</td><td>Method not allowed - Incorrect HTTP verb used, e.g., GET used when POST expected</td></tr> 
<tr><td>406</td><td>no content</td><td>Not acceptable - The response content type does not match the &amp;quot;Accept&amp;quot; header value</td></tr> 
<tr><td>409</td><td>no content</td><td>Conflict - If a resource being created already exists</td></tr> 
<tr><td>415</td><td>no content</td><td>Unsupported media type - The server cannot handle the requested Content-Type</td></tr> 
<tr><td>500</td><td>no content</td><td>Server error - Something went wrong on the Cloud Elements server</td></tr> 
<tr><td>502</td><td>no content</td><td>Provider server error - Something went wrong on the Provider or Endpoint&#039;s server</td></tr> 
</table>


# Models
## custom_fields_names
```json
{
    "type_name": "string",
    "event_id": "string",
    "deleted": "string",
    "section_id": "string",
    "visibility": "string",
    "type_id": "string",
    "edit_permissions": "string",
    "name": "string",
    "id": "string",
    "position": "string",
    "validation_id": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
type_name | string | 
event_id | string | 
deleted | string | 
section_id | string | 
visibility | string | 
type_id | string | 
edit_permissions | string | 
name | string | 
id | string | 
position | string | 
validation_id | string | 

	
## attendees
```json
{
    "custom_fields_names": [
        {
            "type_name": "string",
            "event_id": "string",
            "deleted": "string",
            "section_id": "string",
            "visibility": "string",
            "type_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "position": "string",
            "validation_id": "string"
        }
    ],
    "type": "string",
    "color_class": "string",
    "url": "string",
    "event_id": "integer",
    "name": "string",
    "icon_class": "string",
    "id": "integer",
    "page": "string",
    "position": "integer",
    "items": [
        {
            "website": "string",
            "blockMessaging": "string",
            "image50": "string",
            "facebook": "string",
            "about": "string",
            "external_id": "string",
            "linkedin": "string",
            "title": "string",
            "url": "string",
            "twitter": "string",
            "image100": "string",
            "custom_fields_values": [
                {
                    "field_id": "string",
                    "event_id": "string",
                    "deleted": "string",
                    "visibility": "string",
                    "section_id": "string",
                    "type_id": "string",
                    "owner_id": "string",
                    "edit_permissions": "string",
                    "name": "string",
                    "id": "string",
                    "value": "string",
                    "owner_type": "string"
                }
            ],
            "company_name": "string",
            "id": "string",
            "first_name": "string",
            "email": "string"
        }
    ],
    "config": {
        "hide_regular_fields": "boolean",
        "custom_fields_enabled": "boolean"
    },
    "status": "integer"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
custom_fields_names | array[[custom_fields_names](#custom_fields_names)] | 
type | string | 
color_class | string | 
url | string | 
event_id | integer | 
name | string | 
icon_class | string | 
id | integer | 
page | string | 
position | integer | 
items | array[[items](#items)] | 
config | [config](#config) | 
status | integer | 

	
## objectsMetadataFields
```json
{
    "mask": "string",
    "type": "string",
    "vendorDisplayName": "string",
    "vendorPath": "string",
    "vendorReadOnly": "boolean",
    "vendorRequired": "boolean"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
mask | string | 
type | string | 
vendorDisplayName | string | 
vendorPath | string | 
vendorReadOnly | boolean | 
vendorRequired | boolean | 

	
## sections
```json
{
    "response": {
        "custom_fields_names": [
            {
                "type_name": "string",
                "event_id": "string",
                "deleted": "string",
                "section_id": "string",
                "visibility": "string",
                "type_id": "string",
                "edit_permissions": "string",
                "name": "string",
                "id": "string",
                "position": "string",
                "validation_id": "string"
            }
        ],
        "type": "string",
        "color_class": "string",
        "url": "string",
        "event_id": "integer",
        "name": "string",
        "icon_class": "string",
        "id": "integer",
        "page": "string",
        "position": "integer",
        "items": [
            {
                "website": "string",
                "blockMessaging": "string",
                "image50": "string",
                "facebook": "string",
                "about": "string",
                "external_id": "string",
                "linkedin": "string",
                "title": "string",
                "url": "string",
                "twitter": "string",
                "image100": "string",
                "custom_fields_values": [
                    {
                        "field_id": "string",
                        "event_id": "string",
                        "deleted": "string",
                        "visibility": "string",
                        "section_id": "string",
                        "type_id": "string",
                        "owner_id": "string",
                        "edit_permissions": "string",
                        "name": "string",
                        "id": "string",
                        "value": "string",
                        "owner_type": "string"
                    }
                ],
                "company_name": "string",
                "id": "string",
                "first_name": "string",
                "email": "string"
            }
        ],
        "config": {
            "hide_regular_fields": "boolean",
            "custom_fields_enabled": "boolean"
        },
        "status": "integer"
    },
    "status": "string",
    "timestamp": "integer"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
response | [response](#response) | 
status | string | 
timestamp | integer | 

	
## ads
```json
{
    "sponsorshiplevel": "string",
    "logo_name": "string",
    "call_to_action": "string",
    "exhibitor_id": "string",
    "link": "string",
    "rich": "string",
    "exhibitor_name": "string",
    "title": "string",
    "message": "string",
    "type": "string",
    "call_to_action_url": "string",
    "filename": "string",
    "background_color": "string",
    "call_to_action_text": "string",
    "id": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
sponsorshiplevel | string | 
logo_name | string | 
call_to_action | string | 
exhibitor_id | string | 
link | string | 
rich | string | 
exhibitor_name | string | 
title | string | 
message | string | 
type | string | 
call_to_action_url | string | 
filename | string | 
background_color | string | 
call_to_action_text | string | 
id | string | 

	
## sectionsListObject
```json
{
    "partner_name": "string",
    "type": "string",
    "color_class": "string",
    "url": "string",
    "event_id": "integer",
    "name": "string",
    "icon_class": "string",
    "id": "integer",
    "page": "string",
    "position": "integer",
    "partner_token": "string",
    "show_ads": "boolean",
    "status": "integer"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
partner_name | string | 
type | string | 
color_class | string | 
url | string | 
event_id | integer | 
name | string | 
icon_class | string | 
id | integer | 
page | string | 
position | integer | 
partner_token | string | 
show_ads | boolean | 
status | integer | 

	
## custom_fields_values
```json
{
    "field_id": "string",
    "event_id": "string",
    "deleted": "string",
    "visibility": "string",
    "section_id": "string",
    "type_id": "string",
    "owner_id": "string",
    "edit_permissions": "string",
    "name": "string",
    "id": "string",
    "value": "string",
    "owner_type": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
field_id | string | 
event_id | string | 
deleted | string | 
visibility | string | 
section_id | string | 
type_id | string | 
owner_id | string | 
edit_permissions | string | 
name | string | 
id | string | 
value | string | 
owner_type | string | 

	
## response
```json
{
    "custom_fields_names": [
        {
            "type_name": "string",
            "event_id": "string",
            "deleted": "string",
            "section_id": "string",
            "visibility": "string",
            "type_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "position": "string",
            "validation_id": "string"
        }
    ],
    "type": "string",
    "color_class": "string",
    "url": "string",
    "event_id": "integer",
    "name": "string",
    "icon_class": "string",
    "id": "integer",
    "page": "string",
    "position": "integer",
    "items": [
        {
            "website": "string",
            "blockMessaging": "string",
            "image50": "string",
            "facebook": "string",
            "about": "string",
            "external_id": "string",
            "linkedin": "string",
            "title": "string",
            "url": "string",
            "twitter": "string",
            "image100": "string",
            "custom_fields_values": [
                {
                    "field_id": "string",
                    "event_id": "string",
                    "deleted": "string",
                    "visibility": "string",
                    "section_id": "string",
                    "type_id": "string",
                    "owner_id": "string",
                    "edit_permissions": "string",
                    "name": "string",
                    "id": "string",
                    "value": "string",
                    "owner_type": "string"
                }
            ],
            "company_name": "string",
            "id": "string",
            "first_name": "string",
            "email": "string"
        }
    ],
    "config": {
        "hide_regular_fields": "boolean",
        "custom_fields_enabled": "boolean"
    },
    "status": "integer"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
custom_fields_names | array[[custom_fields_names](#custom_fields_names)] | 
type | string | 
color_class | string | 
url | string | 
event_id | integer | 
name | string | 
icon_class | string | 
id | integer | 
page | string | 
position | integer | 
items | array[[items](#items)] | 
config | [config](#config) | 
status | integer | 

	
## sectionsItems
```json
{
    "website": "string",
    "image50": "string",
    "facebook": "string",
    "about": "string",
    "external_id": "string",
    "linkedin": "string",
    "title": "string",
    "url": "string",
    "twitter": "string",
    "image100": "string",
    "custom_fields_values": [
        {
            "field_id": "string",
            "event_id": "string",
            "deleted": "string",
            "visibility": "string",
            "section_id": "string",
            "type_id": "string",
            "owner_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "value": "string",
            "owner_type": "string"
        }
    ],
    "company_name": "string",
    "id": "string",
    "first_name": "string",
    "threetopics": "string",
    "email": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
website | string | 
image50 | string | 
facebook | string | 
about | string | 
external_id | string | 
linkedin | string | 
title | string | 
url | string | 
twitter | string | 
image100 | string | 
custom_fields_values | array[[custom_fields_values](#custom_fields_values)] | 
company_name | string | 
id | string | 
first_name | string | 
threetopics | string | 
email | string | 

	
## Object
```json
{
    "objectField": "string"
}
```

Fields for the object. There will be fields associated with an Object, which are not all described here.

	
### Fields
Name | Type | Description
--- | --- | ---
objectField | string | 

	
## actionSFDCSyncAttendeeOpportunity
```json
{
    "response": {
        "custom_fields_names": [
            {
                "type_name": "string",
                "event_id": "string",
                "deleted": "string",
                "section_id": "string",
                "visibility": "string",
                "type_id": "string",
                "edit_permissions": "string",
                "name": "string",
                "id": "string",
                "position": "string",
                "validation_id": "string"
            }
        ],
        "type": "string",
        "color_class": "string",
        "url": "string",
        "event_id": "integer",
        "name": "string",
        "icon_class": "string",
        "id": "integer",
        "page": "string",
        "position": "integer",
        "items": [
            {
                "website": "string",
                "blockMessaging": "string",
                "image50": "string",
                "facebook": "string",
                "about": "string",
                "external_id": "string",
                "linkedin": "string",
                "title": "string",
                "url": "string",
                "twitter": "string",
                "image100": "string",
                "custom_fields_values": [
                    {
                        "field_id": "string",
                        "event_id": "string",
                        "deleted": "string",
                        "visibility": "string",
                        "section_id": "string",
                        "type_id": "string",
                        "owner_id": "string",
                        "edit_permissions": "string",
                        "name": "string",
                        "id": "string",
                        "value": "string",
                        "owner_type": "string"
                    }
                ],
                "company_name": "string",
                "id": "string",
                "first_name": "string",
                "email": "string"
            }
        ],
        "config": {
            "hide_regular_fields": "boolean",
            "custom_fields_enabled": "boolean"
        },
        "status": "integer"
    },
    "status": "string",
    "timestamp": "integer"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
response | [response](#response) | 
status | string | 
timestamp | integer | 

	
## objectsMetadata
```json
{
    "fields": [
        {
            "mask": "string",
            "type": "string",
            "vendorDisplayName": "string",
            "vendorPath": "string",
            "vendorReadOnly": "boolean",
            "vendorRequired": "boolean"
        }
    ]
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
fields | array[[objectsMetadataFields](#objectsmetadatafields)] | 

	
## items
```json
{
    "website": "string",
    "blockMessaging": "string",
    "image50": "string",
    "facebook": "string",
    "about": "string",
    "external_id": "string",
    "linkedin": "string",
    "title": "string",
    "url": "string",
    "twitter": "string",
    "image100": "string",
    "custom_fields_values": [
        {
            "field_id": "string",
            "event_id": "string",
            "deleted": "string",
            "visibility": "string",
            "section_id": "string",
            "type_id": "string",
            "owner_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "value": "string",
            "owner_type": "string"
        }
    ],
    "company_name": "string",
    "id": "string",
    "first_name": "string",
    "email": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
website | string | 
blockMessaging | string | 
image50 | string | 
facebook | string | 
about | string | 
external_id | string | 
linkedin | string | 
title | string | 
url | string | 
twitter | string | 
image100 | string | 
custom_fields_values | array[[custom_fields_values](#custom_fields_values)] | 
company_name | string | 
id | string | 
first_name | string | 
email | string | 

	
## config
```json
{
    "hide_regular_fields": "boolean",
    "custom_fields_enabled": "boolean"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
hide_regular_fields | boolean | 
custom_fields_enabled | boolean | 

	
## Pong
```json
{
    "dateTime": "string",
    "endpoint": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
dateTime | string | 
endpoint | string | 

	
## attendeesPeople
```json
{
    "website": "string",
    "image50": "string",
    "facebook": "string",
    "about": "string",
    "external_id": "string",
    "linkedin": "string",
    "title": "string",
    "url": "string",
    "twitter": "string",
    "image100": "string",
    "custom_fields_values": [
        {
            "field_id": "string",
            "event_id": "string",
            "deleted": "string",
            "visibility": "string",
            "section_id": "string",
            "type_id": "string",
            "owner_id": "string",
            "edit_permissions": "string",
            "name": "string",
            "id": "string",
            "value": "string",
            "owner_type": "string"
        }
    ],
    "company_name": "string",
    "id": "string",
    "first_name": "string",
    "email": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
website | string | 
image50 | string | 
facebook | string | 
about | string | 
external_id | string | 
linkedin | string | 
title | string | 
url | string | 
twitter | string | 
image100 | string | 
custom_fields_values | array[[custom_fields_values](#custom_fields_values)] | 
company_name | string | 
id | string | 
first_name | string | 
email | string | 

	
