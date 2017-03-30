
class Connector1C
	def initialize
		WIN32OLE.codepage = WIN32OLE::CP_UTF8
		@server = WIN32OLE.new ("V81.Application")
		connect_string = 'File="C:\Users\Muxx\Desktop\1C_work\1c\Provider\"; Usr="admin";Pwd="123"'
		
		@server.Connect(connect_string)
		@server.Visible = false
	end

	def get_user_data(user, pass)
		@server.ReturnRole(user, pass)
	end

	def get_user_webpage(user)
		@server.ReturnUserWebPage(user)
	end
end
