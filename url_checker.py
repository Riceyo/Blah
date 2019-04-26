import requests


url_list = ['ricey.org']


url_list.append('ricey.org')
url_list.append('ricey.org')


try:
    url_file = open('urls.txt', 'r')
    for line in url_file.readlines():
        url_list.append(line)
except:
    pass


def check_url(url):
    try:
        req_head = requests.head(url)
        return req_head.status_code
    except:
        pass


for current_url in url_list:
    if ('http://' not in current_url) and ('https://' not in current_url):
        current_url = 'http://' + current_url
    if check_url(current_url) != 200:
        open('broken_url.txt', 'a').write(current_url)
