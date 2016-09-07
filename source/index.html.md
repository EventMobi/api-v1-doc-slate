---
title: EventMobi API V2 Spec 2.0.1a

search: true
---

# EventMobi API V2 Spec 2.0.1a
> ### Produces
> `application/json`



## GET /events
### Get events 

```http
GET /en/api/v2/events HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "short_code": "string",
        "name": "string",
        "description": "string",
        "language": "string",
        "data_counters": {
            "sections": "integer",
            "people": "integer",
            "sessions": "integer",
            "companies": "integer",
            "documents": "integer",
            "maps": "integer"
        },
        "event_location": {
            "location_name": "string",
            "location_address": "string"
        },
        "event_dates": {
            "start_date": "string",
            "end_date": "string",
            "time_zone_tz": "string",
            "time_zone_offset": "string",
            "time_format": "integer"
        },
        "event_urls": {
            "event_app": "string",
            "reg_app": "string",
            "checkin_app": "string",
            "cms_app": "string"
        },
        "timestamps": {
            "request_timestamp": "string",
            "creation_timestamp": "string",
            "update_timestamp": "string"
        }
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

List all the events associated with the current organization by API Key or authentication credentials. 

Only basic event infomation will be provided in response to idenitfy events. Please use /events/{eventID} to retrieve details of each event.



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
limit | query | number | Optional. Limits the number of returned results
offset | query | number | Optional. Define the offset index of returned results
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | An array of basic event info
default | object | General 400/500 error

## POST /events
### Post events 

```http
POST /en/api/v2/events HTTP/1.1
Content-Type: application/json

{
    "event": {
        "id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "short_code": "string",
        "name": "string",
        "description": "string",
        "language": "string",
        "event_location": {
            "location_name": "string",
            "location_address": "string"
        },
        "event_dates": {
            "start_date": "string",
            "end_date": "string",
            "time_zone_tz": "string",
            "time_zone_offset": "string",
            "time_format": "integer"
        }
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 402 Payment Required
Content-Type: application/json

{
    "code": "integer"
}
```
```http
HTTP/1.1 409 Conflict
Content-Type: application/json

{
    "code": "integer"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
event | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The new event created
402 | object | Please contact our Sales to set up new event
409 | object | An Event with same ID already exist for the target system.
default | object | General 400/500 error


## GET /events/{event_id}
### Get event 

```http
GET /en/api/v2/events/{event_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The event info created
default | object | General 400/500 error

## PATCH /events/{event_id}
### Patch event 

```http
PATCH /en/api/v2/events/{event_id} HTTP/1.1
Content-Type: application/json

{
    "event": {
        "id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "short_code": "string",
        "name": "string",
        "description": "string",
        "language": "string",
        "event_location": {
            "location_name": "string",
            "location_address": "string"
        },
        "event_dates": {
            "start_date": "string",
            "end_date": "string",
            "time_zone_tz": "string",
            "time_zone_offset": "string",
            "time_format": "integer"
        }
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
event | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The event info created
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error

## PUT /events/{event_id}
### Put event 

```http
PUT /en/api/v2/events/{event_id} HTTP/1.1
Content-Type: application/json

{
    "event": {
        "id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "short_code": "string",
        "name": "string",
        "description": "string",
        "language": "string",
        "event_location": {
            "location_name": "string",
            "location_address": "string"
        },
        "event_dates": {
            "start_date": "string",
            "end_date": "string",
            "time_zone_tz": "string",
            "time_zone_offset": "string",
            "time_format": "integer"
        }
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
event | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The event info updated
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error


## GET /events/{event_id}/people
### Get people 

```http
GET /en/api/v2/events/{event_id}/people HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "people_number": "integer",
    "group_number": "integer",
    "custom_field_number": "integer",
    "groups": [
        {
            "group_id": "string",
            "group_name": "string",
            "group_color": "string",
            "group_note": "string",
            "sub_group_ids": [
                "string"
            ],
            "member_number": "number",
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ],
    "custom_fields": [
        {
            "custom_field_id": "string",
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an overview of people data statistics in specific events. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The statistics of people data
default | object | General 400/500 error


## GET /events/{event_id}/people/data
### Get person 

```http
GET /en/api/v2/events/{event_id}/people/data HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "query_string": "string",
    "record_number": "integer",
    "people_list": [
        {
            "person_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "profile": {
                "first_name": "string",
                "last_name": "string",
                "email_address": "string",
                "picture": "string",
                "groups": [
                    "string"
                ],
                "company": "string",
                "title": "string",
                "about": "string",
                "social_contacts": {
                    "twitter_url": "string",
                    "facebook_url": "string",
                    "linkedin_url": "string",
                    "website_url": "string"
                }
            },
            "custom_fields_meta": "object",
            "favorite_data": {
                "sessions": "object",
                "companies": "object",
                "docs": "object",
                "notes": "object"
            },
            "regstration": {
                "order_ticket_name": "string",
                "order_paid": "string",
                "order_transaction_id": "string",
                "reg_email_campaign": "string",
                "reg_utm": "string",
                "form_meta": [
                    {
                        "question": "string",
                        "answer": "string"
                    }
                ]
            },
            "docs": [
                "string"
            ],
            "config_meta": "object",
            "tags": "string",
            "activities": [
                {
                    "product": "string",
                    "action": "string",
                    "timestamp": "string"
                }
            ],
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ]
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an array of people data statistics in specific events. Default paginition is the first 20 records from offset 0. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
limit | query | number | Optional. Limits the number of returned results
offset | query | number | Optional. Define the offset index of returned results

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The array of people
default | object | General 400/500 error

## POST /events/{event_id}/people/data
### Post person 

```http
POST /en/api/v2/events/{event_id}/people/data HTTP/1.1
Content-Type: application/json

{
    "person": {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "profile": {
            "first_name": "string",
            "last_name": "string",
            "email_address": "string",
            "picture": "string",
            "groups": [
                "string"
            ],
            "company": "string",
            "title": "string",
            "about": "string",
            "social_contacts": {
                "twitter_url": "string",
                "facebook_url": "string",
                "linkedin_url": "string",
                "website_url": "string"
            }
        },
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        },
        "uplaod_docs": [
            {
                "url": "string",
                "rename": "string",
                "assign_groups": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Add new person in the event



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record created
default | object | General 400/500 error


## GET /events/{event_id}/people/data/{person_id}
### Get person_id 

```http
GET /en/api/v2/events/{event_id}/people/data/{person_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The single person record
default | object | General 400/500 error

## PATCH /events/{event_id}/people/data/{person_id}
### Patch person_id 

```http
PATCH /en/api/v2/events/{event_id}/people/data/{person_id} HTTP/1.1
Content-Type: application/json

{
    "person": {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "profile": {
            "first_name": "string",
            "last_name": "string",
            "email_address": "string",
            "picture": "string",
            "groups": [
                "string"
            ],
            "company": "string",
            "title": "string",
            "about": "string",
            "social_contacts": {
                "twitter_url": "string",
                "facebook_url": "string",
                "linkedin_url": "string",
                "website_url": "string"
            }
        },
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        },
        "uplaod_docs": [
            {
                "url": "string",
                "rename": "string",
                "assign_groups": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
default | object | General 400/500 error

## PUT /events/{event_id}/people/data/{person_id}
### Put person_id 

```http
PUT /en/api/v2/events/{event_id}/people/data/{person_id} HTTP/1.1
Content-Type: application/json

{
    "person": {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "profile": {
            "first_name": "string",
            "last_name": "string",
            "email_address": "string",
            "picture": "string",
            "groups": [
                "string"
            ],
            "company": "string",
            "title": "string",
            "about": "string",
            "social_contacts": {
                "twitter_url": "string",
                "facebook_url": "string",
                "linkedin_url": "string",
                "website_url": "string"
            }
        },
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        },
        "uplaod_docs": [
            {
                "url": "string",
                "rename": "string",
                "assign_groups": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
default | object | General 400/500 error

## DELETE /events/{event_id}/people/data/{person_id}
### Delete person_id 

```http
DELETE /en/api/v2/events/{event_id}/people/data/{person_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record deleted
default | object | General 400/500 error


## GET /events/{event_id}/people/data/{person_id}/groups
### Retrieve the groups specific person belongs to 

```http
GET /en/api/v2/events/{event_id}/people/data/{person_id}/groups HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "group_id": "string",
        "group_name": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | List of groups the person belongs to
default | object | General 400/500 error


## POST /events/{event_id}/people/data/{person_id}/groups/{group_id}
### Add person to a group 

```http
POST /en/api/v2/events/{event_id}/people/data/{person_id}/groups/{group_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "group_id": "string",
        "group_name": "string"
    }
]
```
```http
HTTP/1.1 409 Conflict
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Add the Person to the Group. The group_id can be either group name or group ID. If group name has special character, it must be encoded as URL. Body is not needed and will be ignored for this request.



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The groups person belongs to
409 | object | The person already belongs to the group.
default | object | General 400/500 error

## DELETE /events/{event_id}/people/data/{person_id}/groups/{group_id}
### Delete person from group 

```http
DELETE /en/api/v2/events/{event_id}/people/data/{person_id}/groups/{group_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "group_id": "string",
        "group_name": "string"
    }
]
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Remove the person from the group. The group_id can be either group name or group ID. If group name has special character, it must be encoded as URL. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The groups person belongs to
404 | object | The person doesn&#039;t belong to the group.
default | object | General 400/500 error


## GET /events/{event_id}/people/data/{person_id}/sessions
### Retrieve the sessions that this person will attend as attendee 

```http
GET /en/api/v2/events/{event_id}/people/data/{person_id}/sessions HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | List of sessions
default | object | General 400/500 error


## POST /events/{event_id}/people/data/{person_id}/sessions/{session_id}
### Add a session to specifc person (as attendee) 

```http
POST /en/api/v2/events/{event_id}/people/data/{person_id}/sessions/{session_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 409 Conflict
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The sessions person (as attendee) belongs to
409 | object | The person already has this session.
default | object | General 400/500 error

## DELETE /events/{event_id}/people/data/{person_id}/sessions/{session_id}
### Delete person from session attendee list 

```http
DELETE /en/api/v2/events/{event_id}/people/data/{person_id}/sessions/{session_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Delete person from session attendee list



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The sessions person (as attendee) belongs to
404 | object | The person doesn&#039;t belong to the attendee list.
default | object | General 400/500 error


## GET /events/{event_id}/people/groups
### Get all defined people groups 

```http
GET /en/api/v2/events/{event_id}/people/groups HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "group_id": "string",
        "group_name": "string",
        "group_color": "string",
        "group_note": "string",
        "sub_group_ids": [
            "string"
        ],
        "member_number": "number",
        "timestamps": {
            "request_timestamp": "string",
            "creation_timestamp": "string",
            "update_timestamp": "string"
        }
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an array of people group details. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The array of groups defined in People
default | object | General 400/500 error

## POST /events/{event_id}/people/groups
### Create new people group 

```http
POST /en/api/v2/events/{event_id}/people/groups HTTP/1.1
Content-Type: application/json

{
    "group": {
        "group_name": "string",
        "group_color": "string",
        "group_note": "string",
        "group_members": [
            {
                "member_id": "string",
                "member_email": "string"
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "group_id": "string",
    "group_name": "string",
    "group_color": "string",
    "group_note": "string",
    "sub_group_ids": [
        "string"
    ],
    "member_number": "number",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The group created
default | object | General 400/500 error


## GET /events/{event_id}/people/groups/{group_id}
### Get specifc people group info 

```http
GET /en/api/v2/events/{event_id}/people/groups/{group_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "group_id": "string",
    "group_name": "string",
    "group_color": "string",
    "group_note": "string",
    "sub_group_ids": [
        "string"
    ],
    "member_number": "number",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return the detail of specific people group. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The People Group definition
default | object | General 400/500 error

## DELETE /events/{event_id}/people/groups/{group_id}
### Delete people group  

```http
DELETE /en/api/v2/events/{event_id}/people/groups/{group_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This will delete the People Group and remove all members from this group. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The group deleted
default | object | General 400/500 error


## GET /events/{event_id}/people/groups/{group_id}/members
### Get all people inside th group 

```http
GET /en/api/v2/events/{event_id}/people/groups/{group_id}/members HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "timestamps": {
            "request_timestamp": "string",
            "creation_timestamp": "string",
            "update_timestamp": "string"
        }
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return basic info of people in the group. This will only include people ID, name, email and timestamp.



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The member of people in the specific group.
default | object | General 400/500 error


## GET /events/{event_id}/people/custom_fields
### Get all defined custom fields 

```http
GET /en/api/v2/events/{event_id}/people/custom_fields HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an array of people custom fields. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The array of custom fields defined in People
default | object | General 400/500 error

## POST /events/{event_id}/people/custom_fields
### Create new people custom field 

```http
POST /en/api/v2/events/{event_id}/people/custom_fields HTTP/1.1
Content-Type: application/json

{
    "field": {
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "custom_field_id": "string",
    "field_name": "string",
    "view_permission": "string",
    "edit_permission": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will use the field definition in body to create new custom field for People.



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The custom field created
default | object | General 400/500 error


## PUT /events/{event_id}/people/custom_fields/{field_id}
### Overwrite custom fields definition 

```http
PUT /en/api/v2/events/{event_id}/people/custom_fields/{field_id} HTTP/1.1
Content-Type: application/json

{
    "field": {
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will overwrite the definition of specific customer field. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the custome field ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The new definition of custom field
default | object | General 400/500 error

## PATCH /events/{event_id}/people/custom_fields/{field_id}
### Update custom fields definition 

```http
PATCH /en/api/v2/events/{event_id}/people/custom_fields/{field_id} HTTP/1.1
Content-Type: application/json

{
    "field": {
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will update the definition of specific customer field. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the custome field ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The new definition of custom field
default | object | General 400/500 error

## DELETE /events/{event_id}/people/custom_fields/{field_id}
### Delete custom fields definition 

```http
DELETE /en/api/v2/events/{event_id}/people/custom_fields/{field_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will delete the definition of specific customer field. All values of this custome field saved in people records will be deleted.



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the custome field ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The rest of custome fields available in People
default | object | General 400/500 error


## GET /events/{event_id}/sessions
### Get sessions 

```http
GET /en/api/v2/events/{event_id}/sessions HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "session_number": "integer",
    "track_number": "integer",
    "custom_field_number": "integer",
    "session_role_number": "integer",
    "tracks": [
        {
            "group_id": "string",
            "group_name": "string",
            "group_color": "string",
            "group_note": "string",
            "sub_group_ids": [
                "string"
            ],
            "member_number": "number",
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ],
    "custom_fields": [
        {
            "custom_field_id": "string",
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ],
    "sessions_roles": [
        {
            "custom_field_id": "string",
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an overview of event schedule, session and track info. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The overview of all session data
default | object | General 400/500 error


## GET /events/{event_id}/sessions/data
### Get person 

```http
GET /en/api/v2/events/{event_id}/sessions/data HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "query_string": "string",
    "record_number": "integer",
    "session_list": [
        {
            "session_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "session_name": "string",
            "session_description": "string",
            "session_date": "string",
            "session_start_time": "string",
            "session_end_time": "string",
            "session_tracks": [
                "string"
            ],
            "external_links": [
                {
                    "link_name": "string",
                    "link_url": "string"
                }
            ],
            "docs": [
                "string"
            ],
            "session_roles": [
                {
                    "role_name": "string",
                    "people_list": [
                        "string"
                    ]
                }
            ],
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ]
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an array of sessions data statistics in specific events. Default paginition is the first 20 records from offset 0. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
limit | query | number | Optional. Limits the number of returned results
offset | query | number | Optional. Define the offset index of returned results

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The array of sessions.
default | object | General 400/500 error

## POST /events/{event_id}/sessions/data
### Post session 

```http
POST /en/api/v2/events/{event_id}/sessions/data HTTP/1.1
Content-Type: application/json

{
    "session": {
        "session_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "session_name": "string",
        "session_description": "string",
        "session_date": "string",
        "session_start_time": "string",
        "session_end_time": "string",
        "speakers": [
            "string"
        ],
        "session_tracks": [
            "string"
        ],
        "external_links": [
            {
                "link_name": "string",
                "link_url": "string"
            }
        ],
        "docs": [
            "string"
        ],
        "session_roles": [
            {
                "role_name": "string",
                "people_list": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "session_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "session_name": "string",
    "session_description": "string",
    "session_date": "string",
    "session_start_time": "string",
    "session_end_time": "string",
    "session_tracks": [
        "string"
    ],
    "external_links": [
        {
            "link_name": "string",
            "link_url": "string"
        }
    ],
    "docs": [
        "string"
    ],
    "session_roles": [
        {
            "role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Defining a new session



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
session | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session record created
default | object | General 400/500 error


## GET /events/{event_id}/sessions/data/{session_id}
### Get session_id 

```http
GET /en/api/v2/events/{event_id}/sessions/data/{session_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "session_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "session_name": "string",
    "session_description": "string",
    "session_date": "string",
    "session_start_time": "string",
    "session_end_time": "string",
    "session_tracks": [
        "string"
    ],
    "external_links": [
        {
            "link_name": "string",
            "link_url": "string"
        }
    ],
    "docs": [
        "string"
    ],
    "session_roles": [
        {
            "role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The single session record
default | object | General 400/500 error

## PATCH /events/{event_id}/sessions/data/{session_id}
### Patch session_id 

```http
PATCH /en/api/v2/events/{event_id}/sessions/data/{session_id} HTTP/1.1
Content-Type: application/json

{
    "session": {
        "session_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "session_name": "string",
        "session_description": "string",
        "session_date": "string",
        "session_start_time": "string",
        "session_end_time": "string",
        "speakers": [
            "string"
        ],
        "session_tracks": [
            "string"
        ],
        "external_links": [
            {
                "link_name": "string",
                "link_url": "string"
            }
        ],
        "docs": [
            "string"
        ],
        "session_roles": [
            {
                "role_name": "string",
                "people_list": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "session_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "session_name": "string",
    "session_description": "string",
    "session_date": "string",
    "session_start_time": "string",
    "session_end_time": "string",
    "session_tracks": [
        "string"
    ],
    "external_links": [
        {
            "link_name": "string",
            "link_url": "string"
        }
    ],
    "docs": [
        "string"
    ],
    "session_roles": [
        {
            "role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
session | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session record updated
default | object | General 400/500 error

## PUT /events/{event_id}/sessions/data/{session_id}
### Put session_id 

```http
PUT /en/api/v2/events/{event_id}/sessions/data/{session_id} HTTP/1.1
Content-Type: application/json

{
    "session": {
        "session_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "session_name": "string",
        "session_description": "string",
        "session_date": "string",
        "session_start_time": "string",
        "session_end_time": "string",
        "speakers": [
            "string"
        ],
        "session_tracks": [
            "string"
        ],
        "external_links": [
            {
                "link_name": "string",
                "link_url": "string"
            }
        ],
        "docs": [
            "string"
        ],
        "session_roles": [
            {
                "role_name": "string",
                "people_list": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "session_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "session_name": "string",
    "session_description": "string",
    "session_date": "string",
    "session_start_time": "string",
    "session_end_time": "string",
    "session_tracks": [
        "string"
    ],
    "external_links": [
        {
            "link_name": "string",
            "link_url": "string"
        }
    ],
    "docs": [
        "string"
    ],
    "session_roles": [
        {
            "role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
session | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session record updated
default | object | General 400/500 error

## DELETE /events/{event_id}/sessions/data/{session_id}
### Delete session_id 

```http
DELETE /en/api/v2/events/{event_id}/sessions/data/{session_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "session_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "session_name": "string",
    "session_description": "string",
    "session_date": "string",
    "session_start_time": "string",
    "session_end_time": "string",
    "session_tracks": [
        "string"
    ],
    "external_links": [
        {
            "link_name": "string",
            "link_url": "string"
        }
    ],
    "docs": [
        "string"
    ],
    "session_roles": [
        {
            "role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session record that successfully deleted.
default | object | General 400/500 error


## GET /events/{event_id}/sessions/data/{session_id}/attendees
### Retrieve the attendees of specific session 

```http
GET /en/api/v2/events/{event_id}/sessions/data/{session_id}/attendees HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | List of attendees
default | object | General 400/500 error


## POST /events/{event_id}/sessions/data/{session_id}/attendees/{person_id}
### Add an attendee to specifc session 

```http
POST /en/api/v2/events/{event_id}/sessions/data/{session_id}/attendees/{person_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 409 Conflict
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The attendees
409 | object | The attendee people is already in the session.
default | object | General 400/500 error

## DELETE /events/{event_id}/sessions/data/{session_id}/attendees/{person_id}
### Delete person from session attendee list 

```http
DELETE /en/api/v2/events/{event_id}/sessions/data/{session_id}/attendees/{person_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Delete person from session attendee list



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | no content | Success deleted
404 | object | The attendee people doesn&#039;t belong to the session.
default | object | General 400/500 error


## GET /events/{event_id}/sessions/tracks
### Get all defined session tracks 

```http
GET /en/api/v2/events/{event_id}/sessions/tracks HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "group_id": "string",
        "group_name": "string",
        "group_color": "string",
        "group_note": "string",
        "sub_group_ids": [
            "string"
        ],
        "member_number": "number",
        "timestamps": {
            "request_timestamp": "string",
            "creation_timestamp": "string",
            "update_timestamp": "string"
        }
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an array of session track details. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The array of tracks defined in Sessions
default | object | General 400/500 error

## POST /events/{event_id}/sessions/tracks
### Create new session track 

```http
POST /en/api/v2/events/{event_id}/sessions/tracks HTTP/1.1
Content-Type: application/json

{
    "track": "object"
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "group_id": "string",
    "group_name": "string",
    "group_color": "string",
    "group_note": "string",
    "sub_group_ids": [
        "string"
    ],
    "member_number": "number",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
track | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session track created
default | object | General 400/500 error


## GET /events/{event_id}/sessions/tracks/{group_id}
### Get specifc session track info 

```http
GET /en/api/v2/events/{event_id}/sessions/tracks/{group_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "group_id": "string",
    "group_name": "string",
    "group_color": "string",
    "group_note": "string",
    "sub_group_ids": [
        "string"
    ],
    "member_number": "number",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return the detail of specific session track. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The Session Track definition
default | object | General 400/500 error

## DELETE /events/{event_id}/sessions/tracks/{group_id}
### Delete session track 

```http
DELETE /en/api/v2/events/{event_id}/sessions/tracks/{group_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This will delete the Session Track and remove all sessions from this track. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The track deleted
default | object | General 400/500 error


## GET /events/{event_id}/sessions/tracks/{group_id}/list
### Get all sessions in the track 

```http
GET /en/api/v2/events/{event_id}/sessions/tracks/{group_id}/list HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return basic info of sessions in the track. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The list of sessions in the specific track.
default | object | General 400/500 error


## GET /events/{event_id}/sessions/custom_fields
### Get all defined custom fields 

```http
GET /en/api/v2/events/{event_id}/sessions/custom_fields HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an array of people custom fields. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The array of custom fields defined in People
default | object | General 400/500 error

## POST /events/{event_id}/sessions/custom_fields
### Create new people custom field 

```http
POST /en/api/v2/events/{event_id}/sessions/custom_fields HTTP/1.1
Content-Type: application/json

{
    "field": {
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "custom_field_id": "string",
    "field_name": "string",
    "view_permission": "string",
    "edit_permission": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will use the field definition in body to create new custom field for People.



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The custom field created
default | object | General 400/500 error


## PUT /events/{event_id}/sessions/custom_fields/{field_id}
### Overwrite custom fields definition 

```http
PUT /en/api/v2/events/{event_id}/sessions/custom_fields/{field_id} HTTP/1.1
Content-Type: application/json

{
    "field": {
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will overwrite the definition of specific customer field. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the custome field ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The new definition of custom field
default | object | General 400/500 error

## PATCH /events/{event_id}/sessions/custom_fields/{field_id}
### Update custom fields definition 

```http
PATCH /en/api/v2/events/{event_id}/sessions/custom_fields/{field_id} HTTP/1.1
Content-Type: application/json

{
    "field": {
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will update the definition of specific customer field. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the custome field ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The new definition of custom field
default | object | General 400/500 error

## DELETE /events/{event_id}/sessions/custom_fields/{field_id}
### Delete custom fields definition 

```http
DELETE /en/api/v2/events/{event_id}/sessions/custom_fields/{field_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "field_name": "string",
        "view_permission": "string",
        "edit_permission": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will delete the definition of specific customer field. All values of this custome field saved in people records will be deleted.



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
field_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the custome field ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The rest of custome fields available in Sessions
default | object | General 400/500 error


## GET /event/{event_id}/resources/pictures
### Get the info of pictures uploaded for specific event 

```http
GET /en/api/v2/event/{event_id}/resources/pictures HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "resource_id": "string",
        "resource_type": "string",
        "filename": "string",
        "url": "string",
        "upload_filename": "string",
        "upload_request": "string",
        "timestamps": {
            "request_timestamp": "string",
            "creation_timestamp": "string",
            "update_timestamp": "string"
        }
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | the array of picture info
default | object | General 400/500 error

## POST /event/{event_id}/resources/pictures
### Upload new picture resource. 

```http
POST /en/api/v2/event/{event_id}/resources/pictures HTTP/1.1
Content-Type: application/json

{
    "resource": {
        "resource_type": "string",
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        }
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "resource_id": "string",
    "resource_type": "string",
    "filename": "string",
    "url": "string",
    "upload_filename": "string",
    "upload_request": "string",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

In person profile or company logo, this uploaded picture can be used with the response filename (not url).



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
resource | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | the uploaded picture
default | object | General 400/500 error


## GET /event/{event_id}/resources/pictures/{resource_id}
### Get the info of specifc picture uploaded 

```http
GET /en/api/v2/event/{event_id}/resources/pictures/{resource_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "resource_id": "string",
    "resource_type": "string",
    "filename": "string",
    "url": "string",
    "upload_filename": "string",
    "upload_request": "string",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
resource_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the resource ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | the uploaded picture info
default | object | General 400/500 error

## PUT /event/{event_id}/resources/pictures/{resource_id}
### Replace the uploaded picture with the same filename 

```http
PUT /en/api/v2/event/{event_id}/resources/pictures/{resource_id} HTTP/1.1
Content-Type: application/json

{
    "resource": {
        "resource_type": "string",
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        }
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "resource_id": "string",
    "resource_type": "string",
    "filename": "string",
    "url": "string",
    "upload_filename": "string",
    "upload_request": "string",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
resource_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the resource ID.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
resource | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | the updated picture info
default | object | General 400/500 error



# Models
## EventObjectRequest
```json
{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    }
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
id | string | the target Eventmobi ID of event.
external_ids | array[object] | the external IDs used for integrations.
short_code | string | the short-code and url path of event
name | string | the event name
description | string | the description of event in HTML code
language | string | the language of event
event_location | object | The location information of event
event_dates | object | The dates info of event

	
## EventObjectResponse
```json
{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
id | string | the default Eventmobi ID of event.
external_ids | array[object] | the external IDs used for integrations
short_code | string | the short-code and url path of event
name | string | the event name
description | string | the description of event in HTML code
language | string | the language of event
data_counters | object | The numbers of each event data type. Auto-generated: will ignore in post request
event_location | object | The location information of event
event_dates | object | The dates info of event
event_urls | object | The URLs of each Eventmobi products. Auto-generated: will ignore in post request
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## DataCounters
```json
{
    "sections": "integer",
    "people": "integer",
    "sessions": "integer",
    "companies": "integer",
    "documents": "integer",
    "maps": "integer"
}
```

The numbers of each event data type. Auto-generated: will ignore in post request

	
### Fields
Name | Type | Description
--- | --- | ---
sections | integer | the number of front-end UI sections in this event
people | integer | the number of people (speaker, attendee, etc.) in this event. Note: the contacts in reg mailing list are not included.
sessions | integer | the number of session included in this event
companies | integer | the number of companies included in this event
documents | integer | the number of documents uploaded
maps | integer | the number of maps

	
## EventLocation
```json
{
    "location_name": "string",
    "location_address": "string"
}
```

The location information of event

	
### Fields
Name | Type | Description
--- | --- | ---
location_name | string | the name of location (e.g. Eventmobi HQ)
location_address | string | the full address of location (e.g. 175 Bloor St East, Toronto, ON M4W 3R8). Please test with Google Maps to ensure the address can be located correctly.

	
## EventDates
```json
{
    "start_date": "string",
    "end_date": "string",
    "time_zone_tz": "string",
    "time_zone_offset": "string",
    "time_format": "integer"
}
```

The dates info of event

	
### Fields
Name | Type | Description
--- | --- | ---
start_date | string | the start date of event in YYYY-MM-DD
end_date | string | the end date of event in YYYY-MM-DD
time_zone_tz | string | the timezone tz name in https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. E.g. America/Toronto
time_zone_offset | string | the timezone offset to UTC. E.g. -05:00
time_format | integer | the number value can be 12 or 24 hours format. Default value: 12

	
## EventURLs
```json
{
    "event_app": "string",
    "reg_app": "string",
    "checkin_app": "string",
    "cms_app": "string"
}
```

The URLs of each Eventmobi products. Auto-generated: will ignore in post request

	
### Fields
Name | Type | Description
--- | --- | ---
event_app | string | the URL to launch event web App
reg_app | string | the URL to launch reg web App
checkin_app | string | the URL to launch check in App
cms_app | string | the URL to launch CMS backend

	
## PeopleOverview
```json
{
    "people_number": "integer",
    "group_number": "integer",
    "custom_field_number": "integer",
    "groups": [
        {
            "group_id": "string",
            "group_name": "string",
            "group_color": "string",
            "group_note": "string",
            "sub_group_ids": [
                "string"
            ],
            "member_number": "number",
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ],
    "custom_fields": [
        {
            "custom_field_id": "string",
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```

The statistics of people data

	
### Fields
Name | Type | Description
--- | --- | ---
people_number | integer | people number in this event. You may use this number for better query pagination.
group_number | integer | the number of groups defined
custom_field_number | integer | the number of custom fields
groups | array[object] | the groups defined in this event.
custom_fields | array[object] | the custom fields defined in this event
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## PeopleRecordsResponse
```json
{
    "query_string": "string",
    "record_number": "integer",
    "people_list": [
        {
            "person_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "profile": {
                "first_name": "string",
                "last_name": "string",
                "email_address": "string",
                "picture": "string",
                "groups": [
                    "string"
                ],
                "company": "string",
                "title": "string",
                "about": "string",
                "social_contacts": {
                    "twitter_url": "string",
                    "facebook_url": "string",
                    "linkedin_url": "string",
                    "website_url": "string"
                }
            },
            "custom_fields_meta": "object",
            "favorite_data": {
                "sessions": "object",
                "companies": "object",
                "docs": "object",
                "notes": "object"
            },
            "regstration": {
                "order_ticket_name": "string",
                "order_paid": "string",
                "order_transaction_id": "string",
                "reg_email_campaign": "string",
                "reg_utm": "string",
                "form_meta": [
                    {
                        "question": "string",
                        "answer": "string"
                    }
                ]
            },
            "docs": [
                "string"
            ],
            "config_meta": "object",
            "tags": "string",
            "activities": [
                {
                    "product": "string",
                    "action": "string",
                    "timestamp": "string"
                }
            ],
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ]
}
```

the query of people

	
### Fields
Name | Type | Description
--- | --- | ---
query_string | string | the original query string. Offset and limit parameter will show default value (offset=0&amp;limit=20) if not provided in original request.
record_number | integer | the number of recodes that matches query. If no query filters requested, this will be the total number of people.
people_list | array[object] | the array of people

	
## PersonObjectRequest
```json
{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "upload_picture": {
        "url": "string",
        "trim": "string",
        "rename": "string"
    },
    "uplaod_docs": [
        {
            "url": "string",
            "rename": "string",
            "assign_groups": [
                "string"
            ]
        }
    ]
}
```

the single person record

	
### Fields
Name | Type | Description
--- | --- | ---
person_id | string | the unique ID of person in people
external_ids | array[object] | the external IDs used for integrations
profile | object | the profile data of person. Including standard Eventmobi fields as well as custom fields.
upload_picture | object | Use this structure if you want Eventmobi to download the picture from Internet locations and associate picture. You will need to specify image cropping info if the picture is not square (same height and length). This will overwrite the picture filename in base profile.
uplaod_docs | array[object] | 

	
## PersonObjectResponse
```json
{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```

the single person record

	
### Fields
Name | Type | Description
--- | --- | ---
person_id | string | the unique ID of person in people
external_ids | array[object] | the external IDs used for integrations
profile | object | the profile data of person. Including standard Eventmobi fields as well as custom fields.
custom_fields_meta | object | the {custom_field_key:custom_field_value} format JSON object
favorite_data | object | 
regstration | object | the registriation info. Only avialable when using Eventmobi registration product.
docs | array[string] | the docs linked to the people
config_meta | object | the {config_feature_key:config_value} format JSON object E.g.  {&quot;Enable Messaging&quot;:&quot;true&quot;}.
tags | string | tags for the person. Seperated by &quot;,&quot; between keywords.
activities | array[object] | activity logs of a person record.
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## PersonProfile
```json
{
    "first_name": "string",
    "last_name": "string",
    "email_address": "string",
    "picture": "string",
    "groups": [
        "string"
    ],
    "company": "string",
    "title": "string",
    "about": "string",
    "social_contacts": {
        "twitter_url": "string",
        "facebook_url": "string",
        "linkedin_url": "string",
        "website_url": "string"
    }
}
```

the profile data of person. Including standard Eventmobi fields as well as custom fields.

	
### Fields
Name | Type | Description
--- | --- | ---
first_name | string | 
last_name | string | 
email_address | string | 
picture | string | 
groups | array[string] | 
company | string | 
title | string | 
about | string | 
social_contacts | object | The general contact info record

	
## PersonRegistration
```json
{
    "order_ticket_name": "string",
    "order_paid": "string",
    "order_transaction_id": "string",
    "reg_email_campaign": "string",
    "reg_utm": "string",
    "form_meta": [
        {
            "question": "string",
            "answer": "string"
        }
    ]
}
```

the registriation info. Only avialable when using Eventmobi registration product.

	
### Fields
Name | Type | Description
--- | --- | ---
order_ticket_name | string | Ticket Name
order_paid | string | Amount and Currency Type in format of &quot;$ 1,289 USD&quot;
order_transaction_id | string | Striple transaction id for tracking
reg_email_campaign | string | The email title user used to register
reg_utm | string | The UTM tracking parameters in encoded string
form_meta | array[object] | The info user filled in form in reg app

	
## SessionsOverview
```json
{
    "session_number": "integer",
    "track_number": "integer",
    "custom_field_number": "integer",
    "session_role_number": "integer",
    "tracks": [
        {
            "group_id": "string",
            "group_name": "string",
            "group_color": "string",
            "group_note": "string",
            "sub_group_ids": [
                "string"
            ],
            "member_number": "number",
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ],
    "custom_fields": [
        {
            "custom_field_id": "string",
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ],
    "sessions_roles": [
        {
            "custom_field_id": "string",
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```

The statistics of sessions data

	
### Fields
Name | Type | Description
--- | --- | ---
session_number | integer | session number in this event. You may use this number for better query pagination.
track_number | integer | the number of groups defined
custom_field_number | integer | the number of custom fields
session_role_number | integer | the number of session roles fields
tracks | array[object] | the session groups defined in this event.
custom_fields | array[object] | the custom fields defined in sessions
sessions_roles | array[object] | the roles defined in sessions
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## SessionRecordsResponse
```json
{
    "query_string": "string",
    "record_number": "integer",
    "session_list": [
        {
            "session_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "session_name": "string",
            "session_description": "string",
            "session_date": "string",
            "session_start_time": "string",
            "session_end_time": "string",
            "session_tracks": [
                "string"
            ],
            "external_links": [
                {
                    "link_name": "string",
                    "link_url": "string"
                }
            ],
            "docs": [
                "string"
            ],
            "session_roles": [
                {
                    "role_name": "string",
                    "people_list": [
                        "string"
                    ]
                }
            ],
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ]
}
```

the query of sessions

	
### Fields
Name | Type | Description
--- | --- | ---
query_string | string | the original query string. Offset and limit parameter will show default value (offset=0&amp;limit=20) if not provided in original request.
record_number | integer | the number of recodes that matches query. If no query filters requested, this will be the total number of people.
session_list | array[object] | the array of sessions

	
## SessionObjectRequest
```json
{
    "session_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "session_name": "string",
    "session_description": "string",
    "session_date": "string",
    "session_start_time": "string",
    "session_end_time": "string",
    "speakers": [
        "string"
    ],
    "session_tracks": [
        "string"
    ],
    "external_links": [
        {
            "link_name": "string",
            "link_url": "string"
        }
    ],
    "docs": [
        "string"
    ],
    "session_roles": [
        {
            "role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ]
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
session_id | string | the unique session id
external_ids | array[object] | the external IDs used for integrations
session_name | string | 
session_description | string | the html encoded string. Please ensure the correct gramma.
session_date | string | the session date in YYYY-MM-DD format
session_start_time | string | the session start time in HH-MM in 24hour
session_end_time | string | the session end time in HH-MM in 24hour
speakers | array[string] | the people ID as session speakers. External ID supported if request use ext_id_system parameter
session_tracks | array[string] | the ID of tracks this session belongs to
external_links | array[object] | 
docs | array[string] | the docs linked to the people
session_roles | array[object] | the session roles like Speaker, Moderator, etc. Attendees are not in this list. If you want to manage/update this list, you will need to provide the full array of roles. [Issue@Ryan do we support another endpoint like /roles]

	
## SessionObjectResponse
```json
{
    "session_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "session_name": "string",
    "session_description": "string",
    "session_date": "string",
    "session_start_time": "string",
    "session_end_time": "string",
    "session_tracks": [
        "string"
    ],
    "external_links": [
        {
            "link_name": "string",
            "link_url": "string"
        }
    ],
    "docs": [
        "string"
    ],
    "session_roles": [
        {
            "role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
session_id | string | the unique session id
external_ids | array[object] | the external IDs used for integrations
session_name | string | 
session_description | string | the html encoded string. Please ensure the correct gramma.
session_date | string | the session date in YYYY-MM-DD format
session_start_time | string | the session start time in HH-MM in 24hour
session_end_time | string | the session end time in HH-MM in 24hour
session_tracks | array[string] | the ID of tracks this session belongs to
external_links | array[object] | 
docs | array[string] | the docs linked to the people
session_roles | array[object] | the session roles like Speaker, Moderator, etc. Attendees are not in this list.
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## ResourceRequest
```json
{
    "resource_type": "string",
    "upload_picture": {
        "url": "string",
        "trim": "string",
        "rename": "string"
    }
}
```

please provide the resource type and choose the resource info below.

	
### Fields
Name | Type | Description
--- | --- | ---
resource_type | string | 
upload_picture | object | Use this structure if you want Eventmobi to download the picture from Internet locations and associate picture. You will need to specify image cropping info if the picture is not square (same height and length). This will overwrite the picture filename in base profile.

	
## ResourceResponse
```json
{
    "resource_id": "string",
    "resource_type": "string",
    "filename": "string",
    "url": "string",
    "upload_filename": "string",
    "upload_request": "string",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```

the info of the resources uploaded. Event documents are not in this list.

	
### Fields
Name | Type | Description
--- | --- | ---
resource_id | string | the UUID of resource
resource_type | string | 
filename | string | the filename use for person profile photo, company logo, etc.
url | string | the encoded URL to access resource
upload_filename | string | the original filename before renaming or processing
upload_request | string | if upload with request with upload_picture parameter in People/Companies/etc., this will be the API call path
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## IDs
```json
{
    "id_system": "string",
    "id": "string"
}
```

The IDs from different systems. Used for integration mapping. A default Eventmobi ID will always be generated and cannot be changed once created. Additional IDs can be added/updated for external systems.

	
### Fields
Name | Type | Description
--- | --- | ---
id_system | string | The external ID can be accessed when query indicateds which system the ID belongs to. The default system Eventmobi is reserved.

id | string | the external ID

	
## DocLink
```json
"string"
```

The document ID

	
### Fields
Name | Type | Description
--- | --- | ---

	
## URLLink
```json
{
    "link_name": "string",
    "link_url": "string"
}
```

The extra links

	
### Fields
Name | Type | Description
--- | --- | ---
link_name | string | 
link_url | string | 

	
## RequestUploadAssociateDoc
```json
{
    "url": "string",
    "rename": "string",
    "assign_groups": [
        "string"
    ]
}
```

Use this structure if you want Eventmobi to download the document from Internet locations and associate it.

	
### Fields
Name | Type | Description
--- | --- | ---
url | string | file location. Have to have a valid document type ()
rename | string | Must be the same file type as origin. Supports jpeg, jpg and png.
assign_groups | array[string] | the groups this documetion belongs to. the groups must be defined in CMS or this will be ignored.

	
## RequestUploadAssociatePicture
```json
{
    "url": "string",
    "trim": "string",
    "rename": "string"
}
```

Use this structure if you want Eventmobi to download the picture from Internet locations and associate picture. You will need to specify image cropping info if the picture is not square (same height and length). This will overwrite the picture filename in base profile.

	
### Fields
Name | Type | Description
--- | --- | ---
url | string | file location. Have to be a valid image file. Supports jpeg, jpg and png.
trim | string | AxB:CxD means manually crop the image at left-top point AxB and right-bottom point CxD in pixels. This parameter is required if your image is not square (same height and length)
rename | string | Must be the same file type as origin. Supports jpeg, jpg and png.

	
## SocialContactInfo
```json
{
    "twitter_url": "string",
    "facebook_url": "string",
    "linkedin_url": "string",
    "website_url": "string"
}
```

The general contact info record

	
### Fields
Name | Type | Description
--- | --- | ---
twitter_url | string | 
facebook_url | string | 
linkedin_url | string | 
website_url | string | 

	
## RequestGeneralCustomField
```json
{
    "field_name": "string",
    "view_permission": "string",
    "edit_permission": "string"
}
```

The base custom field request

	
### Fields
Name | Type | Description
--- | --- | ---
field_name | string | the field name
view_permission | string | 
edit_permission | string | 

	
## ResponseGeneralCustomFields
```json
{
    "custom_field_id": "string",
    "field_name": "string",
    "view_permission": "string",
    "edit_permission": "string"
}
```

The base custom field model

	
### Fields
Name | Type | Description
--- | --- | ---
custom_field_id | string | the unique ID of custom field
field_name | string | the field name
view_permission | string | 
edit_permission | string | 

	
## ResponseGeneralGroup
```json
{
    "group_id": "string",
    "group_name": "string",
    "group_color": "string",
    "group_note": "string",
    "sub_group_ids": [
        "string"
    ],
    "member_number": "number",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```

The base response model of groups

	
### Fields
Name | Type | Description
--- | --- | ---
group_id | string | the unique ID of group
group_name | string | the unique name of group
group_color | string | the HEX color code in #RRGGBB
group_note | string | the optional note/explaination of this group
sub_group_ids | array[string] | the id array of sub-groups/sub-tracks
member_number | number | the auto-generated number of members in this group
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## ResponsePeopleGroupMember
```json
[
    {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "timestamps": {
            "request_timestamp": "string",
            "creation_timestamp": "string",
            "update_timestamp": "string"
        }
    }
]
```

The basic info of members in people group

	
### Fields
Name | Type | Description
--- | --- | ---

	
## ResponseGroupArray
```json
[
    {
        "group_id": "string",
        "group_name": "string"
    }
]
```

The array of groups

	
### Fields
Name | Type | Description
--- | --- | ---

	
## RequestPeopleGroup
```json
{
    "group_name": "string",
    "group_color": "string",
    "group_note": "string",
    "group_members": [
        {
            "member_id": "string",
            "member_email": "string"
        }
    ]
}
```

Define new group

	
### Fields
Name | Type | Description
--- | --- | ---
group_name | string | the unique name of group
group_color | string | the HEX color code in #RRGGBB. If not provided, system will use default color.
group_note | string | the optional note/explaination of this group
group_members | array[object] | the members to be added to the group. Please provide either id or email.

	
## AttendeePersonalData
```json
{
    "sessions": "object",
    "companies": "object",
    "docs": "object",
    "notes": "object"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
sessions | object | 
companies | object | 
docs | object | 
notes | object | 

	
## GeneralActivityRecord
```json
{
    "product": "string",
    "action": "string",
    "timestamp": "string"
}
```

A single record of people activity history

	
### Fields
Name | Type | Description
--- | --- | ---
product | string | the product of activity. E.g. App/Reg/etc.
action | string | the action info string
timestamp | string | depends on the query parameter timestamp_format setting, this can return GMT/UTC timestamp integer or ISO string.

	
## Timestamps
```json
{
    "request_timestamp": "string",
    "creation_timestamp": "string",
    "update_timestamp": "string"
}
```

The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
### Fields
Name | Type | Description
--- | --- | ---
request_timestamp | string | The time of this API request
creation_timestamp | string | the time of object creation
update_timestamp | string | the time of last modification

	
## PlaceHolder
```json
"object"
```

This is the placeholder

	
### Fields
Name | Type | Description
--- | --- | ---

	
## Error
```json
{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
code | integer | 
message | string | 
fields | string | 

	
