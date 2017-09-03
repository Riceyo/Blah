from flask import Flask, request, render_template

app = Flask(__name__) # create flask object passing it the scripts name (main if run directly and not imported)

@app.route('/') # decorator utl
def index(): # map url to function
    return 'homepage' # return the following to the browser

@app.route('/test')
def test():
    return '<h1>TEST</h1>' # return html to the browser

@app.route('/method', methods=['GET', 'POST']) # check the http method used
def method():
    if request.method == 'POST':
        return 'POST? %s' % request.method
    if request.method == 'GET':
        return 'GET? %s' % request.method

@app.route('/profile/<username>') # add a sub path as a variable
def profile(username):
    return 'Hello %s' % username # return and use the variable

@app.route('/profiletemplate/<username>')
def profiletemplate(username):
    return render_template('profile.html', username=username) # return from template with variable - Hello {{username}}

if __name__ == '__main__': # if name = main (script not imported and run directly)
    app.run(debug=True) # run Flask with debugging enabled
