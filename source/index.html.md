---
title: EventMobi API V2 Spec 2.0.1a

search: true
---

# EventMobi API V2 Spec 2.0.1a
> ### Produces
> `application/json`



## GET /events/{event_id}/people
### Get people 

```http
GET /en/api/v2/events/{event_id}/people HTTP/1.1
ext_id_system: string
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
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "group_type": "string",
            "group_name": "string",
            "group_color": "string",
            "member_number": "number",
            "timestamps": {
                "request_datetime": "string",
                "creation_datetime": "string",
                "update_datetime": "string"
            }
        }
    ],
    "custom_fields": [
        {
            "custom_field_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
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

This request will return an overview of people data statistics in specific events. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The statistics of people data
default | object | General 400/500 error


## GET /events/{event_id}/people/resources
### Get person 

```http
GET /en/api/v2/events/{event_id}/people/resources HTTP/1.1
ext_id_system: string
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
                "picture_url": "string",
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
            "groups": [
                {
                    "group_id": "string",
                    "group_name": "string"
                }
            ],
            "agenda": {
                "sessions": [
                    {
                        "session_id": "string",
                        "session_roles": [
                            "string"
                        ]
                    }
                ]
            },
            "favorite_data": {
                "sessions": [
                    "string"
                ],
                "companies": "object",
                "docs": "object"
            },
            "docs": [
                "string"
            ],
            "personal_settings": "object",
            "timestamps": {
                "request_datetime": "string",
                "creation_datetime": "string",
                "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
ids | query | string | Optional. filter results by specific IDs. Please use &quot;,&quot; to seperate multiple items.
emails | query | string | Optional. filter results by specific Emails. Please use &quot;,&quot; to seperate multiple items.
groups | query | string | Optional. filter results by specific Groups. Please use &quot;,&quot; to seperate multiple items.
limit | query | number | Optional. Limits the number of returned results
offset | query | number | Optional. Define the offset index of returned results

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The array of people
default | object | General 400/500 error

## POST /events/{event_id}/people/resources
### Post person 

```http
POST /en/api/v2/events/{event_id}/people/resources HTTP/1.1
ext_id_system: string
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
            "picture_resource_id": "string",
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
        "assign_groups": [
            "string"
        ],
        "assign_agenda": {
            "sessions": [
                {
                    "session_id": "string",
                    "session_roles": [
                        "string"
                    ]
                }
            ]
        },
        "upload_picture": {
            "url": "string",
            "trim": "string"
        },
        "link_docs": [
            [
                "string"
            ]
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
        "picture_url": "string",
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
    "groups": [
        {
            "group_id": "string",
            "group_name": "string"
        }
    ],
    "agenda": {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
    },
    "favorite_data": {
        "sessions": [
            "string"
        ],
        "companies": "object",
        "docs": "object"
    },
    "docs": [
        "string"
    ],
    "personal_settings": "object",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record created
default | object | General 400/500 error


## GET /events/{event_id}/people/resources/{person_id}
### Get person_id 

```http
GET /en/api/v2/events/{event_id}/people/resources/{person_id} HTTP/1.1
ext_id_system: string
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
        "picture_url": "string",
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
    "groups": [
        {
            "group_id": "string",
            "group_name": "string"
        }
    ],
    "agenda": {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
    },
    "favorite_data": {
        "sessions": [
            "string"
        ],
        "companies": "object",
        "docs": "object"
    },
    "docs": [
        "string"
    ],
    "personal_settings": "object",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The single person record
default | object | General 400/500 error

## PATCH /events/{event_id}/people/resources/{person_id}
### Patch person_id 

```http
PATCH /en/api/v2/events/{event_id}/people/resources/{person_id} HTTP/1.1
ext_id_system: string
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
            "picture_resource_id": "string",
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
        "assign_groups": [
            "string"
        ],
        "assign_agenda": {
            "sessions": [
                {
                    "session_id": "string",
                    "session_roles": [
                        "string"
                    ]
                }
            ]
        },
        "upload_picture": {
            "url": "string",
            "trim": "string"
        },
        "link_docs": [
            [
                "string"
            ]
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
        "picture_url": "string",
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
    "groups": [
        {
            "group_id": "string",
            "group_name": "string"
        }
    ],
    "agenda": {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
    },
    "favorite_data": {
        "sessions": [
            "string"
        ],
        "companies": "object",
        "docs": "object"
    },
    "docs": [
        "string"
    ],
    "personal_settings": "object",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
default | object | General 400/500 error

## PUT /events/{event_id}/people/resources/{person_id}
### Put person_id 

```http
PUT /en/api/v2/events/{event_id}/people/resources/{person_id} HTTP/1.1
ext_id_system: string
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
            "picture_resource_id": "string",
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
        "assign_groups": [
            "string"
        ],
        "assign_agenda": {
            "sessions": [
                {
                    "session_id": "string",
                    "session_roles": [
                        "string"
                    ]
                }
            ]
        },
        "upload_picture": {
            "url": "string",
            "trim": "string"
        },
        "link_docs": [
            [
                "string"
            ]
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
        "picture_url": "string",
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
    "groups": [
        {
            "group_id": "string",
            "group_name": "string"
        }
    ],
    "agenda": {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
    },
    "favorite_data": {
        "sessions": [
            "string"
        ],
        "companies": "object",
        "docs": "object"
    },
    "docs": [
        "string"
    ],
    "personal_settings": "object",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
default | object | General 400/500 error

## DELETE /events/{event_id}/people/resources/{person_id}
### Delete person_id 

```http
DELETE /en/api/v2/events/{event_id}/people/resources/{person_id} HTTP/1.1
ext_id_system: string
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
        "picture_url": "string",
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
    "groups": [
        {
            "group_id": "string",
            "group_name": "string"
        }
    ],
    "agenda": {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
    },
    "favorite_data": {
        "sessions": [
            "string"
        ],
        "companies": "object",
        "docs": "object"
    },
    "docs": [
        "string"
    ],
    "personal_settings": "object",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record deleted
default | object | General 400/500 error


## GET /events/{event_id}/people/resources/{person_id}/groups
### Retrieve the groups specific person belongs to 

```http
GET /en/api/v2/events/{event_id}/people/resources/{person_id}/groups HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | List of groups the person belongs to
default | object | General 400/500 error


## POST /events/{event_id}/people/resources/{person_id}/groups/{group_id}
### Add person to a group 

```http
POST /en/api/v2/events/{event_id}/people/resources/{person_id}/groups/{group_id} HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
groups | query | string | Optional. filter results by specific Groups. Please use &quot;,&quot; to seperate multiple items.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The groups person belongs to
409 | object | The person already belongs to the group.
default | object | General 400/500 error

## DELETE /events/{event_id}/people/resources/{person_id}/groups/{group_id}
### Delete person from group 

```http
DELETE /en/api/v2/events/{event_id}/people/resources/{person_id}/groups/{group_id} HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The groups person belongs to
404 | object | The person doesn&#039;t belong to the group.
default | object | General 400/500 error


## GET /events/{event_id}/people/resources/{person_id}/sessions
### Retrieve the sessions that this person will attend as attendee 

```http
GET /en/api/v2/events/{event_id}/people/resources/{person_id}/sessions HTTP/1.1
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "sessions": [
        {
            "session_id": "string",
            "session_roles": [
                "string"
            ]
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

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | List of sessions
default | object | General 400/500 error

## POST /events/{event_id}/people/resources/{person_id}/sessions
### Add a session to specifc person (as attendee) 

```http
POST /en/api/v2/events/{event_id}/people/resources/{person_id}/sessions HTTP/1.1
ext_id_system: string
Content-Type: application/json

{
    "session": {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
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

[
    {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
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

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
session | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The sessions person (as attendee) belongs to
409 | object | The person already has this session.
default | object | General 400/500 error


## DELETE /events/{event_id}/people/resources/{person_id}/sessions/{session_id}
### Delete person from session attendee list 

```http
DELETE /en/api/v2/events/{event_id}/people/resources/{person_id}/sessions/{session_id} HTTP/1.1
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
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

Delete person from session attendee list



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
session_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the session ID (in event schedule).
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The sessions person (as attendee) belongs to
404 | object | The person doesn&#039;t belong to the attendee list.
default | object | General 400/500 error


## GET /events/{event_id}/people/groups
### Get all defined people groups 

```http
GET /en/api/v2/events/{event_id}/people/groups HTTP/1.1
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "group_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "group_type": "string",
        "group_name": "string",
        "group_color": "string",
        "member_number": "number",
        "timestamps": {
            "request_datetime": "string",
            "creation_datetime": "string",
            "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The array of groups defined in People
default | object | General 400/500 error

## POST /events/{event_id}/people/groups
### Create new people group 

```http
POST /en/api/v2/events/{event_id}/people/groups HTTP/1.1
ext_id_system: string
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
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "group_type": "string",
    "group_name": "string",
    "group_color": "string",
    "member_number": "number",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
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
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "group_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "group_type": "string",
    "group_name": "string",
    "group_color": "string",
    "member_number": "number",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The People Group definition
default | object | General 400/500 error

## DELETE /events/{event_id}/people/groups/{group_id}
### Delete people group  

```http
DELETE /en/api/v2/events/{event_id}/people/groups/{group_id} HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The group deleted
default | object | General 400/500 error


## GET /events/{event_id}/people/groups/{group_id}/members
### Get all people inside th group 

```http
GET /en/api/v2/events/{event_id}/people/groups/{group_id}/members HTTP/1.1
ext_id_system: string
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
            "request_datetime": "string",
            "creation_datetime": "string",
            "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
group_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the group ID.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The member of people in the specific group.
default | object | General 400/500 error


## GET /events/{event_id}/people/custom_fields
### Get all defined custom fields 

```http
GET /en/api/v2/events/{event_id}/people/custom_fields HTTP/1.1
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The array of custom fields defined in People
default | object | General 400/500 error


## GET /events/{event_id}/sessions
### Get sessions 

```http
GET /en/api/v2/events/{event_id}/sessions HTTP/1.1
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "session_number": "integer",
    "track_number": "integer",
    "session_role_number": "integer",
    "tracks": [
        {
            "group_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "group_type": "string",
            "group_name": "string",
            "group_color": "string",
            "member_number": "number",
            "timestamps": {
                "request_datetime": "string",
                "creation_datetime": "string",
                "update_datetime": "string"
            }
        }
    ],
    "sessions_roles": [
        [
            {
                "session_role_id": "string",
                "session_role_name": "string",
                "people_list": [
                    "string"
                ]
            }
        ]
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

This request will return an overview of event schedule, session and track info. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The overview of all session data
default | object | General 400/500 error


## GET /events/{event_id}/sessions/resources
### Get person 

```http
GET /en/api/v2/events/{event_id}/sessions/resources HTTP/1.1
ext_id_system: string
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
                    "session_role_id": "string",
                    "session_role_name": "string",
                    "people_list": [
                        "string"
                    ]
                }
            ],
            "timestamps": {
                "request_datetime": "string",
                "creation_datetime": "string",
                "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
ids | query | string | Optional. filter results by specific IDs. Please use &quot;,&quot; to seperate multiple items.
limit | query | number | Optional. Limits the number of returned results
offset | query | number | Optional. Define the offset index of returned results

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The array of sessions.
default | object | General 400/500 error

## POST /events/{event_id}/sessions/resources
### Post session 

```http
POST /en/api/v2/events/{event_id}/sessions/resources HTTP/1.1
ext_id_system: string
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
                "session_role_id": "string",
                "session_role_name": "string",
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
            "session_role_id": "string",
            "session_role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
session | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session record created
default | object | General 400/500 error


## GET /events/{event_id}/sessions/resources/{session_id}
### Get session_id 

```http
GET /en/api/v2/events/{event_id}/sessions/resources/{session_id} HTTP/1.1
ext_id_system: string
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
            "session_role_id": "string",
            "session_role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The single session record
default | object | General 400/500 error

## PATCH /events/{event_id}/sessions/resources/{session_id}
### Patch session_id 

```http
PATCH /en/api/v2/events/{event_id}/sessions/resources/{session_id} HTTP/1.1
ext_id_system: string
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
                "session_role_id": "string",
                "session_role_name": "string",
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
            "session_role_id": "string",
            "session_role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
session | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session record updated
default | object | General 400/500 error

## PUT /events/{event_id}/sessions/resources/{session_id}
### Put session_id 

```http
PUT /en/api/v2/events/{event_id}/sessions/resources/{session_id} HTTP/1.1
ext_id_system: string
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
                "session_role_id": "string",
                "session_role_name": "string",
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
            "session_role_id": "string",
            "session_role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
session | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session record updated
default | object | General 400/500 error

## DELETE /events/{event_id}/sessions/resources/{session_id}
### Delete session_id 

```http
DELETE /en/api/v2/events/{event_id}/sessions/resources/{session_id} HTTP/1.1
ext_id_system: string
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
            "session_role_id": "string",
            "session_role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session record that successfully deleted.
default | object | General 400/500 error


## GET /events/{event_id}/sessions/resources/{session_id}/attendees
### Retrieve the attendees of specific session 

```http
GET /en/api/v2/events/{event_id}/sessions/resources/{session_id}/attendees HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | List of attendees
default | object | General 400/500 error


## POST /events/{event_id}/sessions/resources/{session_id}/attendees/{person_id}
### Add an attendee to specifc session 

```http
POST /en/api/v2/events/{event_id}/sessions/resources/{session_id}/attendees/{person_id} HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The attendees
409 | object | The attendee people is already in the session.
default | object | General 400/500 error

## DELETE /events/{event_id}/sessions/resources/{session_id}/attendees/{person_id}
### Delete person from session attendee list 

```http
DELETE /en/api/v2/events/{event_id}/sessions/resources/{session_id}/attendees/{person_id} HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

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
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "track_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "track_name": "string",
        "track_color": "string",
        "track_session_number": "number",
        "timestamps": {
            "request_datetime": "string",
            "creation_datetime": "string",
            "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The array of tracks defined in Sessions
default | object | General 400/500 error

## POST /events/{event_id}/sessions/tracks
### Create new session track 

```http
POST /en/api/v2/events/{event_id}/sessions/tracks HTTP/1.1
ext_id_system: string
Content-Type: application/json

{
    "track": "object"
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "track_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "track_name": "string",
    "track_color": "string",
    "track_session_number": "number",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
track | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The session track created
default | object | General 400/500 error


## GET /events/{event_id}/sessions/tracks/{track_id}
### Get specifc session track info 

```http
GET /en/api/v2/events/{event_id}/sessions/tracks/{track_id} HTTP/1.1
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "track_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "track_name": "string",
    "track_color": "string",
    "track_session_number": "number",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
track_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the track ID.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The Session Track definition
default | object | General 400/500 error

## DELETE /events/{event_id}/sessions/tracks/{track_id}
### Delete session track 

```http
DELETE /en/api/v2/events/{event_id}/sessions/tracks/{track_id} HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
track_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the track ID.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The track deleted
default | object | General 400/500 error


## GET /events/{event_id}/sessions/tracks/{track_id}/list
### Get all sessions in the track 

```http
GET /en/api/v2/events/{event_id}/sessions/tracks/{track_id}/list HTTP/1.1
ext_id_system: string
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
track_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the track ID.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The list of sessions in the specific track.
default | object | General 400/500 error


## GET /events/{event_id}/sessions/custom_fields
### Get all defined custom fields 

```http
GET /en/api/v2/events/{event_id}/sessions/custom_fields HTTP/1.1
ext_id_system: string
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "custom_field_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | The array of custom fields defined in People
default | object | General 400/500 error


## GET /event/{event_id}/resources/pictures
### Get the info of pictures uploaded for specific event 

```http
GET /en/api/v2/event/{event_id}/resources/pictures HTTP/1.1
ext_id_system: string
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
            "request_datetime": "string",
            "creation_datetime": "string",
            "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | the array of picture info
default | object | General 400/500 error

## POST /event/{event_id}/resources/pictures
### Upload new picture resource. 

```http
POST /en/api/v2/event/{event_id}/resources/pictures HTTP/1.1
ext_id_system: string
Content-Type: application/json

{
    "resource": {
        "resource_type": "string",
        "upload_picture": {
            "url": "string",
            "trim": "string"
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
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
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
ext_id_system: string
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
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
resource_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the resource ID.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | the uploaded picture info
default | object | General 400/500 error

## PUT /event/{event_id}/resources/pictures/{resource_id}
### Replace the uploaded picture with the same filename 

```http
PUT /en/api/v2/event/{event_id}/resources/pictures/{resource_id} HTTP/1.1
ext_id_system: string
Content-Type: application/json

{
    "resource": {
        "resource_type": "string",
        "upload_picture": {
            "url": "string",
            "trim": "string"
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
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
ext_id_system | header | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
resource_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the resource ID.
resource | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | the updated picture info
default | object | General 400/500 error



# Models
## PeopleOverview
```json
{
    "people_number": "integer",
    "group_number": "integer",
    "custom_field_number": "integer",
    "groups": [
        {
            "group_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "group_type": "string",
            "group_name": "string",
            "group_color": "string",
            "member_number": "number",
            "timestamps": {
                "request_datetime": "string",
                "creation_datetime": "string",
                "update_datetime": "string"
            }
        }
    ],
    "custom_fields": [
        {
            "custom_field_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ]
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
                "picture_url": "string",
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
            "groups": [
                {
                    "group_id": "string",
                    "group_name": "string"
                }
            ],
            "agenda": {
                "sessions": [
                    {
                        "session_id": "string",
                        "session_roles": [
                            "string"
                        ]
                    }
                ]
            },
            "favorite_data": {
                "sessions": [
                    "string"
                ],
                "companies": "object",
                "docs": "object"
            },
            "docs": [
                "string"
            ],
            "personal_settings": "object",
            "timestamps": {
                "request_datetime": "string",
                "creation_datetime": "string",
                "update_datetime": "string"
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
        "picture_resource_id": "string",
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
    "assign_groups": [
        "string"
    ],
    "assign_agenda": {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
    },
    "upload_picture": {
        "url": "string",
        "trim": "string"
    },
    "link_docs": [
        [
            "string"
        ]
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
custom_fields_meta | object | the {custom_field_id:custom_field_value} format JSON object
assign_groups | array[string] | the array of group IDs
assign_agenda | object | Agenda for people record. Defaultly, if no session role is assigned, the people is attendee.
upload_picture | object | Use this structure if you want Eventmobi to download the picture from Internet locations and associate picture. You will need to specify image cropping info if the picture is not square (same height and length). This will overwrite the picture_url in base profile, and the value in picture_url will be ignored.
link_docs | array[array[string]] | 

	
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
        "picture_url": "string",
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
    "groups": [
        {
            "group_id": "string",
            "group_name": "string"
        }
    ],
    "agenda": {
        "sessions": [
            {
                "session_id": "string",
                "session_roles": [
                    "string"
                ]
            }
        ]
    },
    "favorite_data": {
        "sessions": [
            "string"
        ],
        "companies": "object",
        "docs": "object"
    },
    "docs": [
        "string"
    ],
    "personal_settings": "object",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
custom_fields_meta | object | the {custom_field_id:custom_field_value} format JSON object
groups | array[object] | The array of groups
agenda | object | Agenda for people record. Defaultly, if no session role is assigned, the people is attendee.
favorite_data | object | 
docs | array[string] | the docs linked to the people
personal_settings | object | &#039;the {config_feature_key:config_value} format JSON object E.g.  {&quot;direct_messaging&quot;:&quot;true&quot;, &quot;offline_email_messaging&quot;: &quot;true&quot;}.&#039;

timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## PersonProfileRequest
```json
{
    "first_name": "string",
    "last_name": "string",
    "email_address": "string",
    "picture_resource_id": "string",
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
picture_resource_id | string | the resource ID of pictures uploaded
company | string | 
title | string | 
about | string | 
social_contacts | object | The general contact info record

	
## PersonProfileResponse
```json
{
    "first_name": "string",
    "last_name": "string",
    "email_address": "string",
    "picture_url": "string",
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
picture_url | string | the URL of /resource/picture returns after pictures uploaded
company | string | 
title | string | 
about | string | 
social_contacts | object | The general contact info record

	
## SessionsOverview
```json
{
    "session_number": "integer",
    "track_number": "integer",
    "session_role_number": "integer",
    "tracks": [
        {
            "group_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "group_type": "string",
            "group_name": "string",
            "group_color": "string",
            "member_number": "number",
            "timestamps": {
                "request_datetime": "string",
                "creation_datetime": "string",
                "update_datetime": "string"
            }
        }
    ],
    "sessions_roles": [
        [
            {
                "session_role_id": "string",
                "session_role_name": "string",
                "people_list": [
                    "string"
                ]
            }
        ]
    ]
}
```

The statistics of sessions data

	
### Fields
Name | Type | Description
--- | --- | ---
session_number | integer | session number in this event. You may use this number for better query pagination.
track_number | integer | the number of groups defined
session_role_number | integer | the number of session roles fields
tracks | array[object] | the session groups defined in this event.
sessions_roles | array[array[object]] | the roles defined in sessions

	
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
                    "session_role_id": "string",
                    "session_role_name": "string",
                    "people_list": [
                        "string"
                    ]
                }
            ],
            "timestamps": {
                "request_datetime": "string",
                "creation_datetime": "string",
                "update_datetime": "string"
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
            "session_role_id": "string",
            "session_role_name": "string",
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
            "session_role_id": "string",
            "session_role_name": "string",
            "people_list": [
                "string"
            ]
        }
    ],
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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
session_roles | array[object] | the session roles like Speaker, Moderator, etc. Attendees are not in this list. If you want to manage/update this list, you will need to provide the full array of roles. [Issue@Ryan do we support another endpoint like /roles]
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## ResourceRequest
```json
{
    "resource_type": "string",
    "upload_picture": {
        "url": "string",
        "trim": "string"
    }
}
```

please provide the resource type and choose the resource info below.

	
### Fields
Name | Type | Description
--- | --- | ---
resource_type | string | 
upload_picture | object | Use this structure if you want Eventmobi to download the picture from Internet locations and associate picture. You will need to specify image cropping info if the picture is not square (same height and length). This will overwrite the picture_url in base profile, and the value in picture_url will be ignored.

	
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
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
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

id | string | the external ID. Must be unique in the same ID system. Case sensitive.

	
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
[
    "string"
]
```

the array of Document IDs

	
### Fields
Name | Type | Description
--- | --- | ---

	
## RequestUploadAssociatePicture
```json
{
    "url": "string",
    "trim": "string"
}
```

Use this structure if you want Eventmobi to download the picture from Internet locations and associate picture. You will need to specify image cropping info if the picture is not square (same height and length). This will overwrite the picture_url in base profile, and the value in picture_url will be ignored.

	
### Fields
Name | Type | Description
--- | --- | ---
url | string | file location. Have to be a valid image file. Supports jpeg, jpg and png.
trim | string | AxB:CxD means manually crop the image at left-top point AxB and right-bottom point CxD in pixels. The height and width of crop must be the same (image needs to be square). This parameter is required if your image is not square.

	
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

	
## ResponseGeneralCustomFields
```json
{
    "custom_field_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
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
external_ids | array[object] | the external IDs used for integrations
field_name | string | the field name
view_permission | string | 
edit_permission | string | 

	
## ResponseGeneralGroup
```json
{
    "group_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "group_type": "string",
    "group_name": "string",
    "group_color": "string",
    "member_number": "number",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
    }
}
```

The base response model of groups

	
### Fields
Name | Type | Description
--- | --- | ---
group_id | string | the unique ID of group
external_ids | array[object] | the external IDs used for integrations
group_type | string | for people group, it could be &quot;attendees&quot; or &quot;speakers&quot; or &quot;custom&quot;. For other groups, it will be always &quot;custom&quot; for now.
group_name | string | the unique name of group
group_color | string | the HEX color code in #RRGGBB
member_number | number | the auto-generated number of members in this group
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## SessionRoles
```json
[
    {
        "session_role_id": "string",
        "session_role_name": "string",
        "people_list": [
            "string"
        ]
    }
]
```

the session roles like Speaker, Moderator, etc. Attendees are not in this list. If you want to manage/update this list, you will need to provide the full array of roles. [Issue@Ryan do we support another endpoint like /roles]

	
### Fields
Name | Type | Description
--- | --- | ---

	
## SessionRole
```json
{
    "session_role_id": "string",
    "session_role_name": "string",
    "people_list": [
        "string"
    ]
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
session_role_id | string | the unique ID for session role
session_role_name | string | currently only supports &quot;Speaker&quot; and &quot;Moderator&quot;
people_list | array[string] | 

	
## ResponseGeneralTrack
```json
{
    "track_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "track_name": "string",
    "track_color": "string",
    "track_session_number": "number",
    "timestamps": {
        "request_datetime": "string",
        "creation_datetime": "string",
        "update_datetime": "string"
    }
}
```

The track info in response

	
### Fields
Name | Type | Description
--- | --- | ---
track_id | string | the unique ID of track
external_ids | array[object] | the external IDs used for integrations
track_name | string | the unique name of track
track_color | string | the HEX color code in #RRGGBB
track_session_number | number | the auto-generated number of members in this track
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
            "request_datetime": "string",
            "creation_datetime": "string",
            "update_datetime": "string"
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

Define new group. group_type will be assigned as &quot;custom&quot;.

	
### Fields
Name | Type | Description
--- | --- | ---
group_name | string | the unique name of group
group_color | string | the HEX color code in #RRGGBB. If not provided, system will use default color.
group_note | string | the optional note/explaination of this group
group_members | array[object] | the members to be added to the group. Please provide either id or email.

	
## AttendeeAgenda
```json
{
    "sessions": [
        {
            "session_id": "string",
            "session_roles": [
                "string"
            ]
        }
    ]
}
```

Agenda for people record. Defaultly, if no session role is assigned, the people is attendee.

	
### Fields
Name | Type | Description
--- | --- | ---
sessions | array[object] | sessions info in array

	
## AttendeeFavData
```json
{
    "sessions": [
        "string"
    ],
    "companies": "object",
    "docs": "object"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
sessions | array[string] | the personal agenda with session IDs to attend
companies | object | 
docs | object | 

	
## Timestamps
```json
{
    "request_datetime": "string",
    "creation_datetime": "string",
    "update_datetime": "string"
}
```

The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
### Fields
Name | Type | Description
--- | --- | ---
request_datetime | string | The time of this API request
creation_datetime | string | the time of object creation
update_datetime | string | the time of last modification

	
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

	
