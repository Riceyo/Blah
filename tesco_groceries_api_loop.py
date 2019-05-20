import http.client, urllib.request, urllib.parse, urllib.error, base64, time

headers = {'Ocp-Apim-Subscription-Key': ''}

try:
	conn = http.client.HTTPSConnection('dev.tescolabs.com')
	for loop in range(264781000, 264789999, 1):
		time.sleep(1)
		params = urllib.parse.urlencode({'tpnc': loop})
		conn.request("GET", "/product/?%s" % params, "{body}", headers)
		response = conn.getresponse()
		data = str(response.read())
		formatdata = " ".join(data.split()).replace(r"\r\n", "").strip()
		#print(formatdata)
		if (formatdata != "b\'{ \"products\": []}\'"):
			if ("isFood\": false, \"isDrink\": false" not in formatdata):
				fileobj = open("blah.txt", "a")
				fileobj.write(formatdata)
				fileobj.write("\n")
				fileobj.close
	conn.close()
except Exception as e:
    print("[Errno {0}] {1}".format(e.errno, e.strerror))
